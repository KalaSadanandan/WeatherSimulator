package com.tcs.env.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tcs.env.main.WeatherSimulatorMain;

public class WeatherSimulatorMainTest {

	WeatherSimulatorMain weatherSimulatorMain;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		weatherSimulatorMain = new WeatherSimulatorMain();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		
		try {
			String args[] = {"c://Users//331443//KALA//1.txt"};
			weatherSimulatorMain.main(args);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

