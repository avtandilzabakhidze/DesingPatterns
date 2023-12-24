package pattern.behavioral.state;

public class OffState  implements FanState {
    public void handleRequest(Fan fan) {
        System.out.println("Turning fan to low");
        fan.setState(new LowState());
    }
}
