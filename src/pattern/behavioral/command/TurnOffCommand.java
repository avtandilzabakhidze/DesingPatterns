package pattern.behavioral.command;

public class TurnOffCommand implements Command {
    private ElectronicDevice device;

    public TurnOffCommand(ElectronicDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }
}