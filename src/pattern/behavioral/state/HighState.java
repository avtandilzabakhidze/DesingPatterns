package pattern.behavioral.state;

public class HighState implements FanState {
    public void handleRequest(Fan fan) {
        System.out.println("Turning fan off");
        fan.setState(new OffState());
    }
}