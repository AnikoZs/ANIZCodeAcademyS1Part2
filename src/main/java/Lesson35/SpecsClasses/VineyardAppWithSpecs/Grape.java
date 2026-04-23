package Lesson35.SpecsClasses.VineyardAppWithSpecs;

public class Grape extends Crop {

    private String color;
    private double sugarLevel;
    private double weight;
    private int clusterSize;

    // Optional special attributes
    private RareAttributes rareAttributes;


    public Grape(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void addRareAttributes(RareAttributes rareAttributes) {
        this.rareAttributes = rareAttributes;
    }

    public void printRareInfo() {
        if (rareAttributes != null) {
            System.out.println("Celebrity owner: " + rareAttributes.getCelebrityOwner());
        } else {
            System.out.println("No rare attributes.");
        }
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