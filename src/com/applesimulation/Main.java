package com.applesimulation;

public class Main {

    public static void main(String[] args) {
        Simulation simulation = new Simulation(40, 50, 30);
        System.out.println(simulation);
        /*DryClimate dryClimate = new DryClimate(25.0, 50, 0.3);
        System.out.println(dryClimate.growthRatio());
        ColdClimate coldClimate = new ColdClimate(17.0, 20, 0.5);
        System.out.println(coldClimate.growthRatio());
        ModerateClimate moderateClimate = new ModerateClimate(20.0, 40, 0.5);
        System.out.println(moderateClimate.growthRatio());
        Soil soil = new Soil("Czarnoziem", 3.0, false);
        System.out.println(soil.growthRatio());*/
    }
}
