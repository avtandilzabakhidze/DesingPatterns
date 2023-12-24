package pattern.behavioral.command;

public class Television implements ElectronicDevice {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}