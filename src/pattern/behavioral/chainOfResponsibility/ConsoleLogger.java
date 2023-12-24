package pattern.behavioral.chainOfResponsibility;

public class ConsoleLogger implements Logger {
    public void handleLogMessage(String message, int severity) {
        if (severity <= 3) {
            System.out.println("Console Logger: " + message);
        }
    }
}
