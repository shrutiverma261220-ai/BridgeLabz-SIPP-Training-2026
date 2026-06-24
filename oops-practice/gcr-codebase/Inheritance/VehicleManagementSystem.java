interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayVehicle() {
        System.out.println("Model      : " + model);
        System.out.println("Max Speed  : " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric Vehicle is Charging...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol Vehicle is Refueling...");
    }
}

public class VehicleManagementSystem {

    public static void main(String[] args) {

        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model 3", 220);
        PetrolVehicle petrolVehicle = new PetrolVehicle("Honda City", 180);

        System.out.println("----- Electric Vehicle -----");
        electricVehicle.displayVehicle();
        electricVehicle.charge();

        System.out.println();

        System.out.println("----- Petrol Vehicle -----");
        petrolVehicle.displayVehicle();
        petrolVehicle.refuel();
    }
}