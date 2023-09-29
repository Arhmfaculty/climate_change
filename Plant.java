/**
 * The Plant class is an abstract class that represents a generic plant.
 * It contains instance variables for the plant's name, growth stage, and water requirements,
 * as well as abstract methods to set the water requirements and determine if irrigation is needed.
 */
public abstract class Plant {

    /** The name of the plant. */
    protected String name;

    /** The growth stage of the plant. */
    protected String growthStage;

    /** The minimum water requirement for the plant (in millimeters). */
    protected double minWaterRequirement;

    /** The maximum water requirement for the plant (in millimeters). */
    protected double maxWaterRequirement;

    /**
     * Constructs a new Plant with the given name and growth stage.
     * @param name The name of the plant.
     * @param growthStage The growth stage of the plant.
     */
    public Plant(String name, String growthStage) {
        // Set the name and growth stage instance variables
        this.name = name;
        this.growthStage = growthStage;
    }

    /**
     * Abstract method to set the minimum and maximum water requirements for the plant.
     * @param minWaterRequirement The minimum water requirement for the plant (in millimeters).
     * @param maxWaterRequirement The maximum water requirement for the plant (in millimeters).
     */
    public abstract void setValues(double minWaterRequirement, double maxWaterRequirement);

    /**
     * Abstract method to determine if the plant needs irrigation based on the current soil moisture level.
     * @param soilMoisture The current soil moisture level (in millimeters).
     * @return True if the plant needs irrigation, false otherwise.
     */
    public abstract boolean needIrrigation(double soilMoisture);
}