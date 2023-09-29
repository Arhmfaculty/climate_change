/**
 This class represents the main entry point of the Smart Irrigation System.
 It takes user input for plant type and soil type, creates plant and soil objects based on user input.
 It takes sensor values from the user and then calculates the amount of water that can be lost from
 both soil and plant per day,and finally checks if the farm needs irrigation based on soil
 moisture level and triggers irrigation if necessary.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for plant type and the soil type
        System.out.println("\n------------------------------------------------------------------\n" +
                "HELLO✨AND✨WELCOME✨TO✨OUR✨SMART✨IRRIGATION✨SYSTEM 🤝💧🌊🌊\n" +
                "------------------------------------------------------------------\n");
        String soilType;
        String plantType;
        Sensor sensor = new Sensor();

        // Ask the user for the type of soil and continue asking until a valid input is given
        do {
            System.out.print("What type of soil are you working on? Please select one\n" +
                    "(Loamy, " +
                    "Sandy, " +
                    "Clay)\nInput here>: ");
            soilType = scanner.nextLine();
        }
        while (!(soilType.equalsIgnoreCase("Clay") || soilType.equalsIgnoreCase("Loamy")
                || soilType.equalsIgnoreCase("Sandy")));

        // Ask the user for the type of plant and continue asking until a valid input is given
        do {
            System.out.print("Enter the Crop type (Vegetable, Cereal)\nEnter here>:");
            plantType = scanner.nextLine();
        }
        while (!(plantType.equalsIgnoreCase("Cereal") || plantType.equalsIgnoreCase("Vegetable")));

        // Ask the user for the name of the crop and growth stage
        System.out.println("Please enter the name of the crop here(eg. Tomato, Maize, etc.): ");
        String name = scanner.nextLine();
        System.out.println("Enter the growth stage of your plant(eg. Flowering, Seedling etc.): ");
        String stage = scanner.nextLine();

        // Create plant and soil objects based on user inputs
        Plant plant;
        Soil soil;
        if (plantType.equalsIgnoreCase("Cereal")) {
            plant = new Cereal(name, stage);
        } else {
            plant = new Vegetable(name, stage);
        }
        if (soilType.equalsIgnoreCase("Loamy")) {
            soil = new Loamy();
        } else if (soilType.equalsIgnoreCase("Sandy")) {
            soil = new Sandy();
        } else {
            soil = new Clay();
        }

        // Print out the user's farm information
        System.out.println("\nHERE✨IS✨THE✨INFORMATION✨ABOUT✨YOUR✨FARM.\n" +
                "-------------------------------------------------------\n" +
                "You're a " + plantType + " farmer who grows " + name + " on " + soilType + " soil." + "\n" +
                "Your crops are currently at the " + stage + " stage.\n" +
                "-------------------------------------------------------\n");

        // Ask the user if they want to check if the plant needs irrigation
        System.out.println("Please select (1 or any other number)\n" +
                "1. Check if plant needs irrigation\n" +
                "2. select 2 or other to Quit");
        int choice = scanner.nextInt();

        // If the user wants to check if the plant needs irrigation
        if (choice == 1) {
            if (choice == 1) {
                System.out.println("\nEnter sensor values below to check irrigation");

                // Take user inputs for sensor values
                try {
                    System.out.print("Enter temperature: ");
                    double temperature = scanner.nextDouble();

                    System.out.print("Enter humidity: ");
                    double humility = scanner.nextDouble();

                    System.out.print("Enter Solar radiation: ");
                    double solarRadiation = scanner.nextDouble();

                    System.out.print("Enter soil moisture: ");
                    double soilMoisture = scanner.nextDouble();

                    System.out.print("Enter wind speed: ");
                    double windSpeed = scanner.nextDouble();

                    System.out.print("Enter the soil heat flux: ");
                    double soilHeatFlux = scanner.nextDouble();

                    System.out.print("Enter atmospheric pressure: ");
                    double atmosphericPressure = scanner.nextDouble();


                    // Create sensor object and add sensor values
                    sensor.addSensorValues(temperature, humility, solarRadiation, soilMoisture,
                            windSpeed, soilHeatFlux, atmosphericPressure);

                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("Amount of water that can be lost from both soil and plant per day is: "
                            + sensor.calculateDailyWaterLost(plant, soil) + "mm");
                    System.out.println("Your farm should have a soil moisture of " +
                            soil.minSoilMoisture + "--" + soil.maxSoilMoisture + "mm");
                    System.out.println("Current soil moisture is: " + soilMoisture + "mm");

                    // check if the farm needs irrigation
                    if (soil.needIrrigation(soilMoisture) || plant.needIrrigation(soilMoisture)) {
                        IrrigationSystem irrigationSystem = new IrrigationSystem();
                        //  set the amount of water required for irrigation to reach the required soil moisture threshold
                        irrigationSystem.setAmountOfWaterToPump(soil.maxSoilMoisture - soilMoisture);

                        //  irrigate the farm to reach the required soil moisture threshold
                        irrigationSystem.triggerIrrigation((irrigationSystem.getAmountOfWaterToPump()));
                    }
                    System.out.println("-----------------------------------------------------------------------------------");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a decimal number.");
                }
            }

            // to quit the program
            else {
                System.out.println("Thanks for Using our smart irrigation system. Bye👋👋");
                System.exit(1);
            }

            scanner.close();
        }

    }
}