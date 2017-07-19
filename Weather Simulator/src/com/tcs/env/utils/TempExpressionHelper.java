package com.tcs.env.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TempExpressionHelper {

	private static TempExpressionHelper tempExpression = new TempExpressionHelper();

	/* Sea Level Temperature in degrees */
	private static Double seaLevelTemp = 50.0;

	/* Temperature variation with Respect to elevation in degrees */
	private static Double tempPerElevation1 = -0.00356;

	/* Temperature variation with Respect to latitude in degrees */
	private static Double tempPerLatitude = -0.87;

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private TempExpressionHelper() {
	};

	/* Static 'instance' method */
	public static TempExpressionHelper getInstance() {
		if (tempExpression == null) {
			synchronized (TempExpressionHelper.class) {
				if (tempExpression == null) {
					tempExpression = new TempExpressionHelper();
				}
			}
		}
		return tempExpression;
	}

	/**
	 * Get atmospheric temperature according the latitude, altitude and time.
	 *
	 * @param latitude
	 * @param elevation
	 * @param timeStamp
	 * 
	 * @return temperature
	 */
	public Double getTemperature(Double latitude, Double elevation,
			String timeStamp) {

		Double timeFactor = getTimeFactor(timeStamp);

		Double temperature = seaLevelTemp + (tempPerElevation1 * elevation)
				+ (tempPerLatitude * latitude) + timeFactor;

		/*
		 * Double temperature = seaLevelTemp + timeFactor + (tempPerElevation1 *
		 * elevation) - (tempPerLatitude * latitude);
		 */

		if (temperature < -50)
			temperature = -50.00;

		return temperature;

	}

	/**
	 * Get temperature according time.
	 *
	 * @param timeStamp
	 * 
	 * @return temperature
	 */
	public Double getTimeFactor(String timeStamp) {

		// Format Date and get time field.
		Calendar cal = Calendar.getInstance();
		DateFormat f = null;
		Date d = null;
		DateFormat time = null;

		try {
			f = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			d = f.parse(timeStamp);
			time = new SimpleDateFormat("hh:mm:ss");
			cal.setTime(d);
		} catch (ParseException e) {
			e.printStackTrace();

		}

		Double temperature = 0.0;

		switch (cal.get(Calendar.HOUR_OF_DAY)) {
		case 0:
		case 1:
		case 2:
		case 22:
		case 23:
		case 24:
			temperature = 0.0;
			break;
		case 11:
		case 12:
		case 13:
		case 14:
			temperature = 3.0;
			break;

		case 10:
		case 15:
		case 9:
		case 16:
			temperature = 2.0;
			break;

		case 17:
		case 18:
		case 19:
		case 8:
		case 7:
		case 6:
			temperature = 1.5;
			break;

		case 4:
		case 5:
		case 20:
		case 21:
			temperature = 1.0;
			break;

		}

		return temperature;

	}

}
