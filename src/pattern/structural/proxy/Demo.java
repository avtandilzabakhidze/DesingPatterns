package pattern.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        SensitiveInformation proxy = new SensitiveInformationProxy();

        // Unauthorized access attempt
        proxy.display();

        // Authentication with correct password
        ((SensitiveInformationProxy) proxy).authenticate("myPassword");
        proxy.display();

        // Unauthorized access attempt after successful authentication
        proxy.display();
    }
}
