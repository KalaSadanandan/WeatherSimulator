package com.tcs.env.utils;

import org.apache.log4j.Logger;

public class PressureExpressionHelper {

	static Logger LOGGER = Logger.getLogger(PressureExpressionHelper.class
			.getName());
	private static PressureExpressionHelper pressureExpression = new PressureExpressionHelper();

	// static pressure (pressure at sea level) [hPa]
	private Double Pb = (double) 1013.25;

	// standard temperature (temperature at sea level) [K]
	private Double Tb = (double) 273.25;

	// standard temperature lapse rate [K/m] = -0.0065 [K/m]
	private Double Lb = -0.0065;

	// hb - height at the bottom of atmospheric layer [m]
	// The altitude at a given air pressure can be calculated for an altitude up
	// to 11 km (36,090 feet).
	private Double hb = (double) 11000;

	// gravitational acceleration constant = 9.80665
	private Double g0 = 9.80665;

	// molar mass of Earth’s air = 0.0289644 [kg/mol]
	private Double M = 0.0289644;

	// universal gas constant = 8.31432
	private Double R = 8.31432;

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private PressureExpressionHelper() {
	};

	/* Static 'instance' method */
	public static PressureExpressionHelper getInstance() {
		if (pressureExpression == null) {
			synchronized (PressureExpressionHelper.class) {
				if (pressureExpression == null) {
					pressureExpression = new PressureExpressionHelper();
				}
			}
		}
		return pressureExpression;
	}

	/**
	 * Get atmospheric pressure according the latitude/elevation, and
	 * temperature.
	 *
	 * @param latitude
	 *            /elevation
	 * @param temperature
	 * 
	 * @return pressure
	 */
	public Double getPressure(Double elevation, Double temp) {

		Double pressure = Pb
				* (1 + (Lb * elevation) / (temp + (Lb * elevation) + Tb));

		// LOGGER.info("Pressure :: {}",pressure);
		return pressure;

	}

}
