WeatherSimulator program will take location(CITY&COUNTRY), position parameters (Longitude,latitude and Altitude) and Time as input (Read from a file). Based on the input, program will find out temperature, pressure, humidity and condition of a particular location at a particular time and position using respective algorithms and generate the report.
USAGE: java -jar <jarname> <inputFile>
Input File format
INFO: input file should be a comma seperated file containg following parameters.
1: Weather Station Name
2: Country Name
3: Longitude in degrees
4: Latitude in degrees
5: Altitude(Elevation) in meters
6: Date and Time in (YYYY-MM-DD HH:MM:SS.sss) format
This program will take each line from the input file and measure temperature, pressure, humidity and condition internally using respective algorithms and print the result to the console.
Sample input data
MUMBAI,INDIA,-30.86,141.21,39,2015-12-23 10:02:12.000
MUMBAI,INDIA,-31.86,151.21,1000,2015-12-23 11:02:12.000
MUMBAI,INDIA,-32.86,141.21,39,2015-12-23 10:02:12.000
MUMBAI,INDIA,-33.86,151.21,1000,2015-12-23 11:02:12.000
PUNE,INDIA,-32.86,151.21,3000,2015-11-05 12:02:12.000
PUNE,INDIA,-3.86,151.21,4000,2015-12-23 13:02:12.000
KOLKATTA,INDIA,-33.86,151.21,5000,2015-12-23 14:02:12.000
KOLKATTA,INDIA,-33.86,151.21,6000,2015-12-23 15:02:12.000
KERALA,INDIA,-33.86,151.21,7000,2015-12-23 16:02:12.000
KERALA,INDIA,-33.86,151.21,8000,2015-12-23 17:02:12.000
KERALA,INDIA,-33.86,151.21,89000,2015-12-23 17:02:12.000

Output data
KERALA|-33.86,151.21,7000.0|2015-01-23T16:02Z|SNOW|-2|808|100
KERALA|-33.86,151.21,89000.0|2015-01-23T17:02Z|SNOW|-50|2663|100
KOLKATTA|-33.86,151.21,5000.0|2015-01-23T14:02Z|SNOW|5|879|100
KOLKATTA|-33.86,151.21,6000.0|2015-01-23T15:02Z|SNOW|1|845|100
MUMBAI|-32.86,141.21,39.0|2015-01-23T10:02Z|SUNNY|23|1012|61
MUMBAI|-33.86,151.21,1000.0|2015-01-23T11:02Z|RAIN|19|990|74
PUNE|-32.86,151.21,3000.0|2015-01-05T00:02Z|RAIN|10|938|100
PUNE|-3.86,151.21,4000.0|2015-01-23T13:02Z|SUNNY|35|920|30