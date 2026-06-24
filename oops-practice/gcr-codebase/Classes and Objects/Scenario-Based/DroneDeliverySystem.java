public class DroneDeliverySystem {

    // Instance Variables
    private String droneId;
    private int batteryPercentage;

    // Static Variable
    static String companyName = "Sky Logistics";

    // Constructor
    DroneDeliverySystem(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    // Method to Start Delivery
    void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println(droneId + " started delivery.");
            batteryPercentage -= 20;
        } else {
            System.out.println(droneId + " has low battery. Delivery cannot start.");
        }
    }

    // Method to Display Drone Status
    void displayStatus() {
        System.out.println("---------------------------");
        System.out.println("Company Name      : " + companyName);
        System.out.println("Drone ID          : " + droneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
    }

   
    public static void main(String[] args) {

        // Create Multiple Drones
        DroneDeliverySystem d1 = new DroneDeliverySystem("DR101", 100);
        DroneDeliverySystem d2 = new DroneDeliverySystem("DR102", 60);
        DroneDeliverySystem d3 = new DroneDeliverySystem("DR103", 15);

       
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

      
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        
        companyName = "FastFly Logistics";

        System.out.println("\nAfter Changing Company Name:\n");

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}