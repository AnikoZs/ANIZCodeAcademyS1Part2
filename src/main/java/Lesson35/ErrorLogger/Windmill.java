package Lesson35.ErrorLogger;

public abstract class Windmill {
    protected String id;

    public Windmill(String id) {
        this.id = id;
    }

    public abstract double calculatePower(double windSpeed);
}