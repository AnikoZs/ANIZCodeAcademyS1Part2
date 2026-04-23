package Lesson35.ErrorLogger;

public class ConsoleLogger implements Logger {

    private LogLevel minLevel;

    public ConsoleLogger(LogLevel minLevel) {
        this.minLevel = minLevel;
    }

    @Override
    public void log(String message, LogLevel level) {
        if (level.ordinal() >= minLevel.ordinal()) {
            System.out.println("[" + level + "] " + message);
        }
    }
}