package pattern.structural.proxy;

public class SensitiveInformationProxy implements SensitiveInformation {
    private RealSensitiveInformation realSensitiveInformation;
    private String password = "myPassword";

    public void authenticate(String inputPassword) {
        if (inputPassword.equals(password)) {
            realSensitiveInformation = new RealSensitiveInformation("Super Secret Data");
        } else {
            System.out.println("Access denied! Incorrect password.");
        }
    }

    @Override
    public void display() {
        if (realSensitiveInformation != null) {
            realSensitiveInformation.display();
        } else {
            System.out.println("Authentication required to access sensitive information.");
        }
    }
}
