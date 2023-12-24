package pattern.behavioral.chainOfResponsibility;

public class EmailLogger  implements Logger {
    public void handleLogMessage(String message, int severity) {
        if (severity <= 8) {
            System.out.println("Email Logger: " + message);
        }
    }
}