package com.tcs.env.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.env.utils.HumidityExpressionHelper;

public class HumidityExpressionHelperTest {
	HumidityExpressionHelper humidityExpressionHelper;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		humidityExpressionHelper = HumidityExpressionHelper.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHumidity() {
		Double humidity = humidityExpressionHelper.getHumidity(10.00, 25.00);
		assertEquals(53.935543629454976, humidity,0);
	}

}

