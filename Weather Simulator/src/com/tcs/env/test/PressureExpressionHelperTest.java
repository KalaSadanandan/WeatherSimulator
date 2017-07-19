package com.tcs.env.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.env.utils.PressureExpressionHelper;

public class PressureExpressionHelperTest {

	PressureExpressionHelper pressureExpressionHelper;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		pressureExpressionHelper = PressureExpressionHelper.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPressure() {
		
		assertEquals(1012.8909559244419, pressureExpressionHelper.getPressure(15.0, 2.0), 0);
	}

}

