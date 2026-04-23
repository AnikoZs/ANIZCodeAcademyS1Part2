package Lesson35.ErrorLogger;

public class BasicWindmill extends Windmill {

    public BasicWindmill(String id) {
        super(id);
    }

    @Override
    public double calculatePower(double windSpeed) {
        return windSpeed * 1.5;
    }
}