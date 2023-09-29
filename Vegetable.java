/**
 * The Vegetable class represents a type of Plant that is a vegetable crop.
 * It extends the Plant class and overrides its setValues() and needIrrigation() methods.
 */
public class Vegetable extends Plant {
    public Vegetable(String name, String growthStage) {
        super(name, growthStage);
    }

    /**
     * Overrides the setValues() method from the superclass to set the minimum and maximum water requirements for vegetable plants.
     */
    @Override
    public void setValues(double  minWaterRequirement, double  maxWaterRequirement) {
        this.minWaterRequirement = 25;
        this.maxWaterRequirement = 50;
    }
    /**
     * Overrides the needIrrigation() method from the superclass to determine
     * if irrigation is needed based on the current soil moisture level.
     * If the soil moisture level is less than or equal to the minimum water requirement, irrigation is needed.
     * @param soilMoisture The current soil moisture level (in millimeters).
     * @return True if irrigation is needed, false otherwise.
     */
    @Override
    public boolean needIrrigation(double soilMoisture) {
        // If the soil moisture level is less than or equal to the minimum water requirement, irrigation is needed

        if (soilMoisture <= minWaterRequirement) {
            System.out.println("You need to irrigate your crops");

            return true;
        }
        // Otherwise, irrigation is not needed
        System.out.println("No irrigation is needed");
        return false;
    }
}