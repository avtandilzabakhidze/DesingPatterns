package pattern.behavioral.state;

public class LowState implements FanState {
    public void handleRequest(Fan fan) {
        System.out.println("Turning fan to medium");
        fan.setState(new MediumState());
    }
}