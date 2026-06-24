public class SmartParkingManagement {

    // Instance Variables
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor
    SmartParkingManagement(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Display Cars
    static void displayCars(SmartParkingManagement[] vehicles) {
        System.out.println("\n----- Cars -----");

        for (SmartParkingManagement vehicle : vehicles) {
            if (vehicle != null && vehicle.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println("Vehicle Number : " + vehicle.vehicleNumber);
                System.out.println("Owner Name     : " + vehicle.ownerName);
                System.out.println("Vehicle Type   : " + vehicle.vehicleType);
                System.out.println();
            }
        }
    }

    // Display Bikes
    static void displayBikes(SmartParkingManagement[] vehicles) {
        System.out.println("\n----- Bikes -----");

        for (SmartParkingManagement vehicle : vehicles) {
            if (vehicle != null && vehicle.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println("Vehicle Number : " + vehicle.vehicleNumber);
                System.out.println("Owner Name     : " + vehicle.ownerName);
                System.out.println("Vehicle Type   : " + vehicle.vehicleType);
                System.out.println();
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Array to store 10 vehicles
        SmartParkingManagement[] parking = new SmartParkingManagement[10];

        parking[0] = new SmartParkingManagement("UP32AB1010", "Shruti", "Car");
        parking[1] = new SmartParkingManagement("UP32CD2020", "Rahul", "Bike");
        parking[2] = new SmartParkingManagement("UP32EF3030", "Aman", "Car");
        parking[3] = new SmartParkingManagement("UP32GH4040", "Neha", "Bike");
        parking[4] = new SmartParkingManagement("UP32IJ5050", "Riya", "Car");
        parking[5] = new SmartParkingManagement("UP32KL6060", "Amit", "Bike");
        parking[6] = new SmartParkingManagement("UP32MN7070", "Priya", "Car");
        parking[7] = new SmartParkingManagement("UP32OP8080", "Karan", "Bike");
        parking[8] = new SmartParkingManagement("UP32QR9090", "Sonia", "Car");
        parking[9] = new SmartParkingManagement("UP32ST1001", "Rohit", "Bike");

        // Display Vehicles
        displayCars(parking);
        displayBikes(parking);
    }
}