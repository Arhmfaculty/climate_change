/**

 * The Sensor class represents a collection of sensor readings that can be used to calculate various
 * environmental factors such as water demand for a plant. The class includes methods to add sensor readings
 * and to calculate the daily water lost by a plant based on those readings.
 */

import java.util.ArrayList;

public class Sensor {

    // A list to store the sensor readings
    private ArrayList<Double> sensorValues;

    /**
     * Creates a new instance of Sensor with an empty list of sensor readings.
     */
    public Sensor() {
        sensorValues = new ArrayList<>();
    }
    /**
     * Adds sensor readings to the list.
     *
     * @param temperature the temperature reading
     * @param humidity the humidity reading
     * @param solarRadiation the solar radiation reading
     * @param soilMoisture the soil moisture reading
     * @param windSpeed the wind speed reading
     * @param soilHeatFlux the soil heat flux reading
     * @param atmosphericPressure the atmospheric pressure reading
     */
    public void addSensorValues(double temperature, double humidity, double solarRadiation,
                                double soilMoisture, double windSpeed, double soilHeatFlux,
                                double atmosphericPressure) {
        sensorValues.add(temperature);
        sensorValues.add(humidity);
        sensorValues.add(solarRadiation);
        sensorValues.add(soilMoisture);
        sensorValues.add(windSpeed);
        sensorValues.add(soilHeatFlux);
        sensorValues.add(atmosphericPressure);
    }

    /**
     * Calculates the daily water lost by a plant and soil based on sensor readings and plant/soil requirements.
     * @param plant the plant to calculate water loss for
     * @param soil the soil the plant is growing in
     * @return the daily water lost by the plant and soil
     */
    public double calculateDailyWaterLost(Plant plant, Soil soil) {
        // Retrieve sensor readings from the list
        double temperature = sensorValues.get(0);
        double humidity = sensorValues.get(1);
        double solarRadiation = sensorValues.get(2);
        double soilMoisture = sensorValues.get(3);
        double windSpeed = sensorValues.get(4);
        double soilHeatFlux = sensorValues.get(5);
        double atmosphericPressure = sensorValues.get(6);

        // Calculate saturation vapour pressure, actual vapour pressure, slope of saturation vapour pressure curve,
        // and psychrometric constant based on the temperature and atmospheric pressure readings
        double e_s =0.6108*Math.exp((17.27*temperature)/(temperature+237.3)); // saturation vapour pressure
        double e_a=humidity*e_s;// actual vapour pressure using humidity
        double d=(4098*e_s)/Math.pow((temperature+237.3),2); // slope of saturation vapour pressure curve
        double g= 0.665 *atmosphericPressure; // psychrometric constant

        // Calculate daily water demand based on sensor values and plant/soil requirements
        // using the Penman-Monteith evapotranspiration model
        return Math.abs((0.408*d*(solarRadiation-soilHeatFlux)+g*(900/(temperature+237.3))
                *windSpeed*(e_s-e_a))/(d+g*(1+0.34*windSpeed)));
    }
}