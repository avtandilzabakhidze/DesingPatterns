package pattern.behavioral.chainOfResponsibility;

public class FileLogger implements Logger {
    public void handleLogMessage(String message, int severity) {
        if (severity <= 5) {
            System.out.println("File Logger: " + message);
        }
    }}
