package pattern.structural.proxy;

public class RealSensitiveInformation implements SensitiveInformation{
    private String data;

    public RealSensitiveInformation(String data) {
        this.data = data;
    }

    @Override
    public void display() {
        System.out.println("Sensitive Information: " + data);
    }
}
