package smarthome.devices;

public class Thermostat {
    private int currentTemp = 24;
    private int previousTemp;
    public void setTemperature(int temperature) {
        previousTemp = currentTemp;
        currentTemp = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public void undo() {
        currentTemp = previousTemp;
        System.out.println("[Thermostat] Reverting to previous temperature: " + currentTemp + "°C");
    }
}
