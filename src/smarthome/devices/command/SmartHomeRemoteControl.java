package smarthome.devices.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(String slot, Command command) {
        slots.put(slot, command);
    }
}