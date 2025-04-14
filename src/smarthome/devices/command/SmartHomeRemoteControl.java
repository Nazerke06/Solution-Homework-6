package smarthome.devices.command;

import smarthome.devices.command.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(String slot, Command command) {
        slots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot);
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("[Remote] No command assigned to " + slot);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            System.out.println("[Remote] Undo last command");
            lastCommand.undo();
        } else {
            System.out.println("[Remote] Nothing to undo");
        }
    }
}
