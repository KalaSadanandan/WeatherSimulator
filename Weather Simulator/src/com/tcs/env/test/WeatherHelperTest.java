package com.tcs.env.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import com.tcs.env.utils.WeatherHelper;

public class WeatherHelperTest {

	WeatherHelper weatherHelper;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		weatherHelper = WeatherHelper.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetWeatherInfo() {
		try {
			weatherHelper.getWeatherInfo("c://Users//331443//KALA//1.txt");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Exception Occurred");
		}
	}

}
