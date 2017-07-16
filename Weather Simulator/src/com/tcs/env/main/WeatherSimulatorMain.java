/*                                                                      *\
 **    A Toy Model of Environment 
 **/

package com.tcs.env.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.tcs.env.utils.WeatherHelper;

public class WeatherSimulatorMain {
	
	public static void main(String args[]) throws FileNotFoundException,
			IOException {

		// Check inputParameters
		if (args.length == 1) {
			try {
				WeatherHelper.getInstance().getWeatherInfo(args[0]);
			} catch (Exception e) {
			    System.out.println("Failed to execut program. ");
			    System.exit(1);
			}
		} else {
			WeatherHelper.getInstance().DisplayUsage();
			System.exit(2);
		}
		
		System.out.println("Successfully executed the program. ");

	}
}
