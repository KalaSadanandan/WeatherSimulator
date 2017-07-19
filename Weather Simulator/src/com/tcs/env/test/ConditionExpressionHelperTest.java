package com.tcs.env.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.env.utils.ConditionExpressionHelper;

public class ConditionExpressionHelperTest {

	ConditionExpressionHelper conditionExpressionHelper;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		conditionExpressionHelper = ConditionExpressionHelper.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCondition() {

		assertEquals("SNOW",
				conditionExpressionHelper.getCondition(55.00, 09.00));
		assertEquals("SUNNY",
				conditionExpressionHelper.getCondition(11.00, 25.00));
		assertEquals("RAIN",
				conditionExpressionHelper.getCondition(11.00, 15.00));
		// assertEquals("SNOW", conditionExpressionHelper.getCondition(11.00,
		// 80.00));

	}

}
