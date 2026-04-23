package Lesson35.ErrorLogger;

public class Main {
    public static void main(String[] args) {

        // Only show WARNING and ERROR
        Logger logger = new ConsoleLogger(LogLevel.WARNING);

        // Try this instead:
        //Logger logger = new FileLogger("log.txt");

        Windmill windmill = new BasicWindmill("WM-1");

        WindmillFileReader reader = new WindmillFileReader(logger);
        reader.readWindData("winddata.txt", windmill);
    }
}