package Lesson35.SpecsClasses.TheUltimateVineyardManagerApp;

public class WineGrape extends Grape {
    private int fermentationLevel;
    private boolean barrelAged;
    private int harvestYear;

    public WineGrape(String name, int age, String color) {
        super(name, age, color);
    }

    public void ferment() {
        fermentationLevel += 10;
        System.out.println("Fermenting grapes...");
    }
}