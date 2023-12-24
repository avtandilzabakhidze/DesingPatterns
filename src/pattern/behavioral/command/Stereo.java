package pattern.behavioral.command;

public class Stereo implements ElectronicDevice {
    public void turnOn() {
        System.out.println("Stereo is ON");
    }

    public void turnOff() {
        System.out.println("Stereo is OFF");
    }
}