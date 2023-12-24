package pattern.behavioral.command;

public class Demo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        ElectronicDevice tv = new Television();
        Command turnOnTV = new TurnOnCommand(tv);
        Command turnOffTV = new TurnOffCommand(tv);

        remote.setCommand(turnOnTV);
        remote.pressButton(); // Turns on the TV

        remote.setCommand(turnOffTV);
        remote.pressButton(); // Turns off the TV
    }
}
