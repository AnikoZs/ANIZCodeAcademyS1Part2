package Lesson35.ConsolLogging;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();

        Train train = new Train("InterCity Express", logger);

        train.depart();
        train.delay(10);
        train.breakdown();
    }
}