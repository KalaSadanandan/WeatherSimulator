/*                                                                      *\
 **    A Toy Model of Environment 
 **/

package com.tcs.env.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.tcs.env.utils.WeatherHelper;

public class WeatherSimulatorMain {	
	static Logger LOGGER = Logger.getLogger(WeatherSimulatorMain.class.getName());
	
	public static void main(String args[]) throws FileNotFoundException,
			IOException {
		LOGGER.log(Level.INFO, "Inside Main method");
		
		// Check inputParameters
		if (args.length == 1) 
			WeatherHelper.getInstance().getWeatherInfo(args[0]);	
		
		else 
			WeatherHelper.getInstance().DisplayUsage();	
		

	}
}
