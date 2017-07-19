package com.tcs.env.test;


import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.env.utils.TimeExpressionHelper;

public class TimeExpressionHelperTest {

	TimeExpressionHelper timeExpressionHelper;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		timeExpressionHelper = TimeExpressionHelper.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTimeInISO8601Format() {
		try {
			assertEquals("2013-01-29T06:35Z",timeExpressionHelper.getTimeInISO8601Format("2013-07-29 06:35:40.622"));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Exception Occurred");
		}
	}

}

