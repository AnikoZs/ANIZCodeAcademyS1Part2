package Lesson35.SpecsClasses.TheUltimateVineyardManagerApp;

public abstract class Crop implements Harvestable {
    protected String name;
    protected int age;
    protected double waterLevel;
    protected double sunExposure;
    protected boolean isOrganic;
    protected double growthRate;
    protected int health;
    protected double size;
    protected String soilType;
    protected boolean readyForHarvest;

    public Crop(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void grow();

    public void water(double amount) {
        waterLevel += amount;
    }
}