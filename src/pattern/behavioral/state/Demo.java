package pattern.behavioral.state;

public class Demo {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.pullChain(); // Turns fan to low
        fan.pullChain(); // Turns fan to medium
        fan.pullChain(); // Turns fan to high
        fan.pullChain(); // Turns fan off
    }
}
