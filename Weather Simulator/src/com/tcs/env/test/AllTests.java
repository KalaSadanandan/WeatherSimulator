package com.tcs.env.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConditionExpressionHelperTest.class,
		HumidityExpressionHelperTest.class, PressureExpressionHelperTest.class,
		TempExpressionHelperTest.class, TimeExpressionHelperTest.class,
		WeatherHelperTest.class, WeatherSimulatorMainTest.class })
public class AllTests {

}
