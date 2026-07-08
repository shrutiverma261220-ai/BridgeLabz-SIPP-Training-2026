public abstract class Vehicle {

    private int vehicleId;
    private String vehicleName;
    private double rentPerDay;

    public Vehicle(int vehicleId, String vehicleName, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.rentPerDay = rentPerDay;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public abstract void displayDetails();

    @Override
    public String toString() {
        return "Vehicle ID : " + vehicleId +
                ", Vehicle Name : " + vehicleName +
                ", Rent Per Day : ₹" + rentPerDay;
    }
}