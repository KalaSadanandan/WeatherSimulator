package com.tcs.env.utils;


public class HumidityExpressionHelper {

	private static HumidityExpressionHelper humidityExpression = new HumidityExpressionHelper();

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private HumidityExpressionHelper() {
	};

	/* Static 'instance' method */
	public static HumidityExpressionHelper getInstance() {
		if (humidityExpression == null) {
			synchronized (HumidityExpressionHelper.class) {
				if (humidityExpression == null) {
					humidityExpression = new HumidityExpressionHelper();
				}
			}
		}
		return humidityExpression;
	}

	/**
	 * Get atmospheric Humidity according the pressure and temperature.
	 *
	 * @param pressure
	 * @param temperature
	 * 
	 * @return humidity
	 */

	public Double getHumidity(Double pressure, Double temperature) {

		pressure = pressure * 100;
		// Double dewpointTemp= (241.88*
		// (Math.log((pressure/610.78)/(17.558-Math.log(pressure/610.78))))) -
		// 32;
		Double temp1 = Math.log(pressure / 610.78);
		Double temp2 = 17.558 - temp1;

		Double dewpointTemp = temp1 / temp2 + 15;

		Double vapourPressure = 6.11 * Math.pow(10,
				((7.5 * dewpointTemp) / (237.3 + dewpointTemp)));

		Double saturatedVapouePressure = 6.11 * Math.pow(10,
				((7.5 * temperature) / (237.3 + temperature)));

		Double humidity = vapourPressure / saturatedVapouePressure * 100;

		if (humidity > 100)
			return 100.00;
		else
			return humidity;

	}

}
