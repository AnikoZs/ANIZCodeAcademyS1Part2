package Lesson35.ConsolLogging;

public class Train {
    private String name;
    private Logger logger;

    public Train(String name, Logger logger) {
        this.name = name;
        this.logger = logger;
    }

    public void depart() {
        logger.info(name + " is departing.");
    }

    public void delay(int minutes) {
        logger.warning(name + " is delayed by " + minutes + " minutes.");
    }

    public void breakdown() {
        logger.error(name + " has broken down!");
    }
}