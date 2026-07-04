public class Bike extends Vehicle {

    private String brand;
    private int engineCC;
    private String bikeType;

    public Bike(int vehicleId, String vehicleName, double rentPerDay,
                String brand, int engineCC, String bikeType) {

        super(vehicleId, vehicleName, rentPerDay);
        this.brand = brand;
        this.engineCC = engineCC;
        this.bikeType = bikeType;
    }

    public String getBrand() {
        return brand;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public void displayDetails() {

        System.out.println("===== Bike Details =====");
        System.out.println("Vehicle ID      : " + getVehicleId());
        System.out.println("Vehicle Name    : " + getVehicleName());
        System.out.println("Brand           : " + brand);
        System.out.println("Engine Capacity : " + engineCC + " CC");
        System.out.println("Bike Type       : " + bikeType);
        System.out.println("Rent Per Day    : ₹" + getRentPerDay());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Bike{" +
                "vehicleId=" + getVehicleId() +
                ", vehicleName='" + getVehicleName() + '\'' +
                ", brand='" + brand + '\'' +
                ", engineCC=" + engineCC +
                ", bikeType='" + bikeType + '\'' +
                ", rentPerDay=" + getRentPerDay() +
                '}';
    }
}