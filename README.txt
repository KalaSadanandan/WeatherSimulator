
This program will take location, position parameters and Time as input and will generate the atmospheric attributes 
and generate report.

USAGE: java -jar <jarname> <inputFile>"

Input File format
=================

INFO: input file should be a comma seperated file containg following parameters.
1: Weather Station Name
2: Country Name
3: Longitude in degrees
4: Latitude in degrees
5: Altitude(Elevation) in meters
6: Date and Time in (YYYY-MM-DD HH:MM:SS.sss) format



sample data
------------
THRISSUR,INDIA,-30.86,141.21,39,2015-12-23 10:02:12.000

THRISSUR,INDIA,-31.86,151.21,1000,2015-12-23 11:02:12.000

THRISSUR,INDIA,-32.86,141.21,39,2015-12-23 10:02:12.000

THRISSUR,INDIA,-33.86,151.21,1000,2015-12-23 11:02:12.000

ERNAKULAM,INDIA,-32.86,151.21,3000,2015-11-05 12:02:12.000

ERNAKULAM,INDIA,-3.86,151.21,4000,2015-12-23 13:02:12.000

PALAKKAD,INDIA,-33.86,151.21,5000,2015-12-23 14:02:12.000

PALAKKAD,INDIA,-33.86,151.21,6000,2015-12-23 15:02:12.000

KOTTAYAM,INDIA,-33.86,151.21,7000,2015-12-23 16:02:12.000

KOTTAYAM,INDIA,-33.86,151.21,8000,2015-12-23 17:02:12.000

KOTTAYAM,INDIA,-33.86,151.21,89000,2015-12-23 17:02:12.000
