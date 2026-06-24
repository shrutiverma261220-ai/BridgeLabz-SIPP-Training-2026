public class SpaceTourist {

    // Static Variables
    static int totalReservations = 0;
    static String missionName = "Moon Explorer";

    // Instance Variables
    String touristName;
    int seatNumber;

    // Constructor
    SpaceTourist(String touristName, int seatNumber) {
        this.touristName = touristName;
        this.seatNumber = seatNumber;
        totalReservations++;
    }

    // Method Chaining
    SpaceTourist updateSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    // Display Details
    void displayDetails() {
        System.out.println("Mission Name      : " + missionName);
        System.out.println("Tourist Name      : " + touristName);
        System.out.println("Seat Number       : " + seatNumber);
        System.out.println("Total Reservations: " + totalReservations);
    }

    // Main Method
    public static void main(String[] args) {

        SpaceTourist tourist = new SpaceTourist("Shruti", 10);

        // Method Chaining
        tourist.updateSeatNumber(12)
               .updateSeatNumber(15);

        tourist.displayDetails();
    }
}