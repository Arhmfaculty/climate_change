/**

 The IrrigationSystem class represents an irrigation system that pumps water to a plant.
 It has a private field amountOfWaterToPump which represents the amount of water to be pumped by the system.
 The class provides methods to trigger the irrigation system and to get and set the amount of water to pump.
 */
public class IrrigationSystem {
    private double amountOfWaterToPump;


    public IrrigationSystem() {
        // Initialize irrigation system with default values
        this.amountOfWaterToPump = 0.0;
    }

    /**
     This method triggers the irrigation system to pump water.
     It takes in the amount of water to pump as a parameter and sets the amountOfWaterToPump field to that value.
     It then prints a message to the console indicating the amount of water being pumped.
     @param amountOfWaterToPump the amount of water to pump by the irrigation system
     */
    public void triggerIrrigation(double amountOfWaterToPump) {
        // Trigger irrigation system to pump water
        this.amountOfWaterToPump = amountOfWaterToPump;
        System.out.println("Irrigation system is pumping " + amountOfWaterToPump+"mm of water" );
    }
    /**
     This method returns the amount of water to be pumped by the irrigation system.
     @return the amount of water to pump
     */
    public double getAmountOfWaterToPump() {
        return amountOfWaterToPump;
    }
    /**
     This method sets the amount of water to be pumped by the irrigation system.
     @param amountOfWaterToPump the amount of water to pump
     */
    public void setAmountOfWaterToPump(double amountOfWaterToPump) {
        this.amountOfWaterToPump = amountOfWaterToPump;
    }

}