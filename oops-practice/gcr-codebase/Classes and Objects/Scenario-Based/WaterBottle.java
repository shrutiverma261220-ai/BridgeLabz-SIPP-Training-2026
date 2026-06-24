public class WaterBottle {

    // Instance Variables
    String ownerName;
    int dailyTarget;

    // Constructor
    WaterBottle(String ownerName, int dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    // Method to Display Bottle Information
    void displayBottleInfo() {
        System.out.println("Owner Name  : " + ownerName);
        System.out.println("Daily Target: " + dailyTarget + " ml");
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        // Create Two Bottle Objects
        WaterBottle bottle1 = new WaterBottle("Shruti", 2500);
        WaterBottle bottle2 = new WaterBottle("Rahul", 3000);

        // Display Information
        bottle1.displayBottleInfo();
        bottle2.displayBottleInfo();
    }
}