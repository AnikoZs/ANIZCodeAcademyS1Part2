package Lesson35.SpecsClasses.VineyardAppWithSpecs;

public class VineyardApp {

    public static void main(String[] args) {
        Grape g1 = new Grape("Chardonnay", 2, "Green");
        WineGrape g2 = new WineGrape("Merlot", 3, "Red");
        AngryGrape g3 = new AngryGrape("RebelGrape", 1, "Purple");

        g1.grow();
        g2.ferment();
        g3.harvest();

        System.out.println(g1.calculateYield());
    }
}