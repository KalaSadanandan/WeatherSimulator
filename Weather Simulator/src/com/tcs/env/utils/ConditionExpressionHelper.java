package com.tcs.env.utils;

import org.apache.log4j.Logger;

public class ConditionExpressionHelper {
	static Logger LOGGER = Logger.getLogger(ConditionExpressionHelper.class
			.getName());
	private static ConditionExpressionHelper conditionExpression = new ConditionExpressionHelper();

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private ConditionExpressionHelper() {
	};

	/* Static 'instance' method */
	public static ConditionExpressionHelper getInstance() {
		if (conditionExpression == null) {
			synchronized (ConditionExpressionHelper.class) {
				if (conditionExpression == null) {
					conditionExpression = new ConditionExpressionHelper();
				}
			}
		}
		return conditionExpression;
	}

	/**
	 * Get atmospheric Condition according the Humidity and temperature.
	 *
	 * @param humidity
	 * @param temperature
	 * 
	 * @return string (RAIN/SNOW/SUNNY)
	 */
	public String getCondition(Double humidity, Double temperature) {

		String condition = null;

		if (temperature > 20)
			condition = "SUNNY";
		else if (temperature < 10 && humidity > 50)
			return "SNOW";
		else if (temperature < 20)
			condition = "RAIN";
		else
			condition = "SNOW";

		LOGGER.info("Condition ::"+condition);
		return condition;

	}

}
