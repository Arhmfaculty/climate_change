/**
 * The Soil class is an abstract class that represents a generic soil.
 * It contains instance variables for the minimum and maximum soil moisture levels,
 * as well as an abstract method to determine if irrigation is needed.
 */
public abstract class Soil {

    /** The minimum soil moisture level (in millimeters). */
    protected int minSoilMoisture;

    /** The maximum soil moisture level (in millimeters). */
    protected int maxSoilMoisture;

    /**
     * Abstract method to determine if irrigation is needed based on the current soil moisture level.
     * @param soilMoisture The current soil moisture level (in millimeters).
     * @return True if irrigation is needed, false otherwise.
     */
    public abstract boolean needIrrigation(double soilMoisture);
}