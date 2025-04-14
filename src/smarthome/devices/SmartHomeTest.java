package smarthome.devices;

import smarthome.devices.command.*;
import smarthome.devices.*;
import smarthome.devices.command.Command;
import smarthome.devices.command.SetThermostatCommand;
import smarthome.devices.command.SmartHomeRemoteControl;
import smarthome.devices.command.TurnOnLightCommand;

public class SmartHomeTest {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp22 = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightOn);
        remote.setCommand("thermo", setTemp22);

        remote.pressButton("light");
        remote.pressButton("thermo");

        remote.undoButton();
        remote.undoButton();
    }
}
