package pattern.behavioral.state;

public class Fan {
    private FanState state;

    public Fan() {
        state = new OffState();
    }

    public void setState(FanState state) {
        this.state = state;
    }

    public void pullChain() {
        state.handleRequest(this);
    }
}
