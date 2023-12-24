package pattern.behavioral.state;

public class MediumState implements FanState {
    public void handleRequest(Fan fan) {
        System.out.println("Turning fan to high");
        fan.setState(new HighState());
    }
}