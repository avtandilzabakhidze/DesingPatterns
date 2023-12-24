package pattern.behavioral.chainOfResponsibility;

public interface Logger {
    void handleLogMessage(String message, int severity);
}
