package com.tcs.env.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class TimeExpressionHelper {
	
	private static TimeExpressionHelper timeExpression = new TimeExpressionHelper();

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private TimeExpressionHelper() {
	};

	/* Static 'instance' method */
	public static TimeExpressionHelper getInstance() {
		if (timeExpression == null) {
			synchronized (PressureExpressionHelper.class) {
				if (timeExpression == null) {
					timeExpression = new TimeExpressionHelper();
				}
			}
		}
		return timeExpression;
	}

	/**
	 * Get timestamp in ISO8601Format time.
	 *
	 * @param timeStamp
	 * 
	 * @return temperature
	 */

	public String getTimeInISO8601Format(String timeStamp)
			throws ParseException {

		DateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss.SSS");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date d = sdf.parse(timeStamp);
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); // Quoted
																		// "Z"
																		// to
																		// indicate
																		// UTC,
																		// no
																		// timezone
																		// offset
		df.setTimeZone(tz);
		String nowAsISO = df.format(d);

		//LOGGER.info("Timestamp in ISO8601 format:: {}", nowAsISO);
		return nowAsISO;

	}

}
