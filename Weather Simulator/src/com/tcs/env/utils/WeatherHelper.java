package com.tcs.env.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.tcs.env.constants.WeatherConstants;

public class WeatherHelper {

	static Logger LOGGER = Logger.getLogger(WeatherHelper.class.getName());

	private static WeatherHelper weatherHelper = new WeatherHelper();

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private WeatherHelper() {
	};

	/* Static 'instance' method */
	public static WeatherHelper getInstance() {
		if (weatherHelper == null) {
			synchronized (WeatherHelper.class) {
				if (weatherHelper == null) {
					weatherHelper = new WeatherHelper();
				}
			}
		}
		return weatherHelper;
	}

	/**
	 * Get atmospheric temperature according the latitude, altitude and time.
	 *
	 * @param latitude
	 * @param elevation
	 * @param timeStamp
	 * 
	 * @return temperature
	 * @throws FileNotFoundException
	 */
	public void getWeatherInfo(String inputFile) throws FileNotFoundException {
		// Read input File and for each row calcualte
		// temperature,Pressure,Humidy and Condition using algorithm.

		BufferedReader br = new BufferedReader(new FileReader(inputFile)); //

		Map<String, String> sortedMap = new TreeMap<String, String>();
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				LOGGER.info("INPUT LINE IS: " + line.toString());

				if(line != null && !line.isEmpty()) {
					String[] lineData = line.split(Pattern
							.quote(WeatherConstants.COMMA));

					if (lineData.length == 6) {

						// process the line.

						try {

							/* Work Station Name from input File. */
							String location = lineData[0];
							/* Latitude in degrees from input File. */
							Double latitude = Double.parseDouble(lineData[2]);
							/* Longitude in degrees from input File. */
							Double longitude = Double.parseDouble(lineData[3]);
							/* Altitude/Elevation in Meters from input File. */
							Double altitude = Double.parseDouble(lineData[4]);
							/*
							 * Timestamp in the format YYYY-MM-DD HH:MM:SS from
							 * input File.
							 */
							String timeStamp = lineData[5];

							/* Get atmospheric Temperature. */
							Double temp = TempExpressionHelper.getInstance()
									.getTemperature(Math.abs(latitude),
											altitude, timeStamp);
							/* Get atmospheric Pressure. */
							Double pressure = PressureExpressionHelper
									.getInstance().getPressure(altitude, temp);

							/* Get atmospheric Humidity. */
							Double humidity = HumidityExpressionHelper
									.getInstance().getHumidity(pressure, temp);

							/* Get atmospheric Condition. */
							String condition = ConditionExpressionHelper
									.getInstance().getCondition(humidity, temp);

							/* Get timestamp in ISO8601 Format */
							String timeInISO8601 = TimeExpressionHelper
									.getInstance().getTimeInISO8601Format(
											timeStamp);

							String weatherInfo = saveWeatherInfo(location,
									temp, pressure, humidity, condition,
									timeInISO8601, latitude, longitude,
									altitude);

							// Put the results inside a map
							sortedMap
									.put(location + timeInISO8601, weatherInfo);

						} catch (Exception e) {
							System.out.println("Exception occured: "
									+ e.getMessage());
						}

					} else
						WeatherHelper.getInstance().DisplayUsage();
				}
			}

			// print weather information
			printWeatherInfo(sortedMap);

		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Method for saving the weather information in the mentioned format
	 * LOCATION|latitude,longitude,altitude|time in
	 * ISO8601|contion|pressure|humidity.
	 *
	 * @param location
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 * @param condition
	 * @param timeStamp
	 * @param latitude
	 * @param longitude
	 * @param altitude
	 * @return cmd
	 * 
	 */
	public String saveWeatherInfo(String location, Double temp,
			Double pressure, Double humidity, String condition,
			String timeStamp, Double latitude, Double longitude, Double altitude) {
		StringBuilder cmd = new StringBuilder();
		cmd.append(location).append(WeatherConstants.PIPE).append(latitude)
				.append(WeatherConstants.COMMA).append(longitude)
				.append(WeatherConstants.COMMA).append(altitude)
				.append(WeatherConstants.PIPE).append(timeStamp)
				.append(WeatherConstants.PIPE).append(condition)
				.append(WeatherConstants.PIPE)
				.append(Math.round(temp * 100) / 100)
				.append(WeatherConstants.PIPE)
				.append(Math.round(pressure * 100) / 100)
				.append(WeatherConstants.PIPE)
				.append(Math.round(humidity * 100) / 100);

		LOGGER.info("Weather Info::" + cmd.toString());
		return cmd.toString();
	}

	public void DisplayUsage() {
		System.out.println("Please provide correct input parameters.");
		System.out.print("USAGE: java -jar <jarname> <inputFile>");

		System.out
				.println("INFO: input file should be a comma seperated file containg following parameters.");
		System.out.println("1: Weather Station Name");
		System.out.println("2: Country Name");
		System.out.println("3: Longitude in degrees");
		System.out.println("4: Latitude in degrees");
		System.out.println("5: Altitude(Elevation) in meters");
		System.out
				.println("6: Date and Time in (YYYY-MM-DD HH:MM:SS.sss) format");

	}

	/**
	 * Method for printing weather information in the mentioned format
	 * LOCATION|latitude,longitude,altitude|time in
	 * ISO8601|contion|pressure|humidity.
	 */
	public void printWeatherInfo(Map<String, String> sortedMap) {
		for (Entry<String, String> entry : sortedMap.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

}
