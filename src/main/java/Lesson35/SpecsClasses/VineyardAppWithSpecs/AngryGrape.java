package Lesson35.SpecsClasses.VineyardAppWithSpecs;

public class AngryGrape extends Grape {


    public AngryGrape(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void harvest() {
        System.out.println(name + " refuses to be harvested 😡");
    }
}