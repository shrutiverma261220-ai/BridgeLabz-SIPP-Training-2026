class SmartDevice {
    int deviceId;
    String status;

    SmartDevice(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class SmartThermostat extends SmartDevice {
    int temperatureSetting;

    SmartThermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status : " + status);
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {

        SmartThermostat thermostat =
                new SmartThermostat(101, "ON", 24);

        thermostat.displayStatus();
    }
}