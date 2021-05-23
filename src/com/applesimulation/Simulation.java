package com.applesimulation;

import java.util.ArrayList;

public class Simulation {
    public Integer healthyApples;
    public Integer spoiledApples;
    public Integer simulationLength;
    public Weather weather;
    public AppleTree appleTree;

    public Simulation(Integer healthyApples, Integer spoiledApples, Integer simulationLength) {
        this.healthyApples = healthyApples;
        this.spoiledApples = spoiledApples;
        this.simulationLength = simulationLength;
        this.weather = new Weather(17.8, 100, "Suchy");
        AppleTreeGenerator appleTreeGenerator = new AppleTreeGenerator();
        this.appleTree = appleTreeGenerator.generate();
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Healthy apples: " + this.healthyApples);
        result.add("Spoiled apples: " + this.spoiledApples);
        result.add("Simulation length: " + this.simulationLength);
        result.add("Weather: " + this.weather);
        result.add("Apple tree: " + this.appleTree);

        return String.join("\n", result);
    }
}



