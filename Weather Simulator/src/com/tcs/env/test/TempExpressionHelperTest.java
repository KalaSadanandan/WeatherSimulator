package com.tcs.env.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.env.utils.TempExpressionHelper;

public class TempExpressionHelperTest {

	TempExpressionHelper tempExpressionHelper;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tempExpressionHelper = TempExpressionHelper.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTemperature() {
		assertEquals("-50.0", tempExpressionHelper.getTemperature(150.0, 1000.0, "2015-02-14 16:00:00.00").toString());
	}

	@Test
	public void testGetTimeFactor() {
		
		assertEquals(2.0, tempExpressionHelper.getTimeFactor("2015-02-14 16:00:00.00"),0);
		assertEquals(0.0, tempExpressionHelper.getTimeFactor("2015-02-14 01:00:00.00"),0);
		assertEquals(1.5, tempExpressionHelper.getTimeFactor("2015-02-14 06:00:00.00"),0);
		assertEquals(1.0, tempExpressionHelper.getTimeFactor("2015-02-14 20:00:00.00"),0);
		assertEquals(3.0, tempExpressionHelper.getTimeFactor("2015-02-14 14:00:00.00"),0);
		
	}

}
