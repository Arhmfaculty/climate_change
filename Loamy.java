/**
 * The Loamy class represents a type of soil called loamy.
 * It extends the Soil abstract class and sets the minimum and maximum soil moisture levels
 * specific to loamy soil. It also implements the needIrrigation method to determine
 * if irrigation is needed based on the current soil moisture level.
 */
public class Loamy extends Soil {

    /**
     * Constructor for the Loamy class. Sets the minimum and maximum soil moisture levels
     * specific to loamy soil.
     */
    public Loamy() {
        this.minSoilMoisture = 100;
        this.maxSoilMoisture = 175;
    }

    /**
     * Determines if irrigation is needed based on the current soil moisture level.
     * @return True if irrigation is needed, false otherwise.
     */
    @Override
    public boolean needIrrigation(double soilMoisture) {
        if (soilMoisture <= minSoilMoisture) {
            System.out.println("You need to irrigate your crops");
            return true;
        }
        System.out.println("No irrigation is needed");
        return false;
    }
}