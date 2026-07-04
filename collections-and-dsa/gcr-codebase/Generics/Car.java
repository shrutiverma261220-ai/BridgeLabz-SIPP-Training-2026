public class Car extends Vehicle {

    private String brand;
    private int seatingCapacity;
    private String fuelType;

    public Car(int vehicleId, String vehicleName, double rentPerDay,
               String brand, int seatingCapacity, String fuelType) {

        super(vehicleId, vehicleName, rentPerDay);
        this.brand = brand;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {

        System.out.println("===== Car Details =====");
        System.out.println("Vehicle ID       : " + getVehicleId());
        System.out.println("Vehicle Name     : " + getVehicleName());
        System.out.println("Brand            : " + brand);
        System.out.println("Fuel Type        : " + fuelType);
        System.out.println("Seating Capacity : " + seatingCapacity);
        System.out.println("Rent Per Day     : ₹" + getRentPerDay());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleId=" + getVehicleId() +
                ", vehicleName='" + getVehicleName() + '\'' +
                ", brand='" + brand + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", rentPerDay=" + getRentPerDay() +
                '}';
    }
}