public class VehicleRegistration {

    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable
    static double registrationFee = 2000.0;

    // Constructor
    VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println();
    }

    // Class Method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated successfully.\n");
    }

    // Main Method
    public static void main(String[] args) {

        VehicleRegistration v1 = new VehicleRegistration("Shruti", "Car");
        VehicleRegistration v2 = new VehicleRegistration("Rahul", "Bike");

        System.out.println("----- Vehicle Details Before Fee Update -----");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        VehicleRegistration.updateRegistrationFee(2500);

        System.out.println("----- Vehicle Details After Fee Update -----");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}