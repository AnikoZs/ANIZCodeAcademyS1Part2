package Lesson35.SpecsClasses.TheUltimateVineyardManagerApp;

public class Grape extends Crop {
    private String color;
    private double sugarLevel;
    private boolean usedForWine;
    private int seeds;
    private double acidity;
    private String variety;
    private boolean isPremium;
    private double weight;
    private int clusterSize;
    private boolean attackedByBirds;

    public Grape(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void grow() {
        size += 1.5;
        sugarLevel += 0.2;
    }

    @Override
    public void harvest() {
        System.out.println(name + " is harvested!");
        readyForHarvest = false;
    }

    @Override
    public double calculateYield() {
        return weight * clusterSize;
    }
}