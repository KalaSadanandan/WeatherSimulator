     
# **WeatherSimulator**
[![Build Status](https://travis-ci.org/cubean/environment-toy-model.svg?branch=master)](https://travis-ci.org/cubean/environment-toy-model)[![Coverage Status](https://coveralls.io/repos/github/cubean/environment-toy-model/badge.svg?branch=master)](https://coveralls.io/github/cubean/environment-toy-model?branch=master)[![Stories in Ready](https://badge.waffle.io/cubean/environment-toy-model.svg?label=ready&title=Ready)](http://waffle.io/cubean/environment-toy-model)


## **Overview**

This is a toy model of the weather.
The source code could be run and test in both console and eclipse.

## **Getting Started**

Create a toy model of the environment (taking into account things like atmosphere, topography, geography, oceanography, or similar) that evolves over time. Then take measurements at various locations (ie weather stations), and then have your program emit that data, as in the following:

                   Station    Local Time  Temperature  Pressure  Humidity  Conditions 
     Sydney      2015-12-23   16:02:12      Rain        +12.5    1010.3    97 
     Melbourne   2015-12-25   02:30:55      Snow        -5.3     998.4     55 
     Adelaide    2016-01-04   23:05:37      Sunny       +39.4    1114.1    12 
     
where temperature is in Â°C, pressure in hPa, and relative humidity as a %. Obviously you can't give it to us as a table (ok, yes, you could feed us markdown, but let's not do that?) so instead submit your data to us in the following format

>     SYD|-33.86,151.21,39|2015-12-23T05:02:12Z|Rain|+12.5|1004.3|97
>     MEL|-37.83,144.98,7|2015-12-24T15:30:55Z|Snow|-5.3|998.4|55
>     ADL|-34.92,138.62,48|2016-01-03T12:35:37Z|Sunny|+39.4|1114.1|12

WeatherSimulator program will take location(CITY&COUNTRY), position parameters (Longitude,latitude and Altitude) and Time as input (Read from a file). Based on the input, program will find out temperature, pressure, humidity and condition of a particular location at a particular time and position using respective algorithms and generate the report.


## **How to test**

The test is designed to be relatively realistic in a variety of ways.  
You could run the test in 2 ways:

1. Console: java -jar jarname inputFile
2. Eclipse 

## **Input File Format**
INFO: input file should be a comma seperated file containg following parameters.
1. Weather Station Name
2. Country Name
3. Longitude in degrees
4. Latitude in degrees
5. Altitude(Elevation) in meters
6. Date and Time in (YYYY-MM-DD HH:MM:SS.sss) format
