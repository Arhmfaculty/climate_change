"# climate_change" 
Tittle: Smart Irrigation System

Overview:
The Smart Irrigation System is a solution designed to address 
the challenges facing the agriculture industry due to climate change. 
The system is a weather-based irrigation scheduling system that helps farmers to monitor 
and manage their irrigation systems more efficiently, 
while conserving water and increasing crop yield.


Project Description:
A smart irrigation system that will help us adapt to the rampant increase in climate change on a global scale. To solve the issues of climate change, food security, and population expansion, smart irrigation, which uses technology to control and optimize water consumption, is a possible solution. By delivering real-time data on soil moisture, weather, and water use, smart irrigation systems can assist farmers in monitoring and managing their irrigation systems more efficiently.

The solution will include a weather-based irrigation scheduling system that makes use of sensors (users) to track and quantify the factors influencing evapotranspiration (daily water loss). The system will include several classes that represent its various parts.

The sensor class will be used to gather weather data about the crop using an array list. 
In this project, the sensor values are provided by the user. 
The user input values for temperature, humidity, wind speed, rainfall, and air pressure. 
With the use of evapotranspiration models (daily water loss), these characteristics will be 
utilized to gather field data near the plant and calculate the water demand.

The plant class is an abstract class inherited by two classes, cereals, and vegetables,
 as the type of plants that our project is centered on.

The Soil class is an abstract class which is inherited by the soil type 
(Sandy, Clay, and Loamy) and provides information on the stage of growth for the crop and minimum and maximum soil moisture. 
This information is used to determine the appropriate threshold for irrigation scheduling, as different soil types and crop growth stages require different amounts of water.

The Irrigation Schedule System class is responsible for scheduling irrigation based on a pre-determined amount of evapotranspiration.
 This threshold will vary with soil type, crop type, and stage of growth.


Features:
The Smart Irrigation System includes the following features:

A sensor class that tracks and quantifies the factors influencing evapotranspiration (daily water loss) 
using user input values for temperature, humidity, wind speed, rainfall, and air pressure.

A plant class that represents two types of plants -
 cereals and vegetables - and provides information on the stage of growth for the crop.

A soil class that represents three types of soil - 
sandy, clay, and loamy - and provides information on the
 minimum and maximum soil moisture levels for each soil type.

An irrigation schedule system class that schedules irrigation based on
 a pre-determined amount of evapotranspiration, 
 which varies with soil type, crop type, and stage of growth.


 Usage:
To use the Smart Irrigation System, the user must provide input values for temperature, humidity, wind speed, rainfall, and air pressure using the sensor class. The system then calculates the daily water demand using evapotranspiration models and schedules irrigation based on a pre-determined threshold using the soil and plant classes.

requirements:
The following procedures should be followed in order to run the Smart Irrigation System project:

Make sure the Java Development Kit (JDK) is set up on your machine.
Get the project files from the GitHub repository.
Extract the files to a location of your choice.
Go to the project folder by opening a terminal window or command prompt.
Run the command javac*.java to complete the project's compilation.
Run the project by typing java Main.
Note: Prior to launching the project, make sure to enter input values for
the sensors (user inputs) in the Sensor class in the Main.java file. 
This will guarantee that the system can determine the water demand and properly plan irrigation.Additionally, you may adjust the parameters for crop kind, development stage, 
and soil moisture in the Soil class to suit your requirements.
