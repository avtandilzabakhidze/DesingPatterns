package pattern.behavioral.chainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        // Create different loggers
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger emailLogger = new EmailLogger();

        // Set up the chain of responsibility
        consoleLogger.handleLogMessage("Low severity log", 2);
        fileLogger.handleLogMessage("Medium severity log", 5);
        emailLogger.handleLogMessage("High severity log", 9);
    }
}
