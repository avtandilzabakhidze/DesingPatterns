package pattern.behavioral.command;

public class TurnOnCommand implements Command {
    private ElectronicDevice device;

    public TurnOnCommand(ElectronicDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}