
/**
 * The Sandy class represents a type of soil called Sandy.
 * It extends the Soil abstract class and sets the minimum and maximum soil moisture levels
 * specific to sandy soil. It also implements the needIrrigation method to determine
 * if irrigation is needed based on the current soil moisture level.
 */
public class Sandy extends Soil {
    public Sandy() {
        this.minSoilMoisture = 25;
        this.maxSoilMoisture = 100;
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