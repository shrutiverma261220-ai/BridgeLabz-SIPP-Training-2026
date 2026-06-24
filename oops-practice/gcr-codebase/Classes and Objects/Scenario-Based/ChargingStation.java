public class ChargingStation {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.5;

    // Instance Variables
    private String stationId;
    private double unitsConsumed;

    // Constructor
    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate Bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Station Details
    void displayStationDetails() {
        System.out.println("------------------------------");
        System.out.println("Station ID       : " + stationId);
        System.out.println("Units Consumed   : " + unitsConsumed);
        System.out.println("Electricity Rate : ₹" + electricityRate + " per unit");
        System.out.println("Bill Amount      : ₹" + calculateBill());
    }

    // Main Method
    public static void main(String[] args) {

        // Create 5 Charging Stations
        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 200);
        ChargingStation s4 = new ChargingStation("CS104", 180);
        ChargingStation s5 = new ChargingStation("CS105", 250);

        System.out.println("----- Bills Before Rate Change -----");
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        // Change Electricity Rate
        electricityRate = 10.0;

        System.out.println("\n----- Bills After Rate Change -----");
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        // Display Total Stations
        System.out.println("\nTotal Charging Stations: " + totalStations);
    }
}