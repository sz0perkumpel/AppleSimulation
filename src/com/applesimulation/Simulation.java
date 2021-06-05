package com.applesimulation;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Simulation {
    public Integer simulationLength;
    public Weather weather;
    public AppleTree appleTree;
    public Soil soil;
    public Integer currentDay;

    public Simulation(Integer simulationLength, Weather weather) {
        this.simulationLength = simulationLength;
        this.weather = weather;
        AppleTreeGenerator appleTreeGenerator = new AppleTreeGenerator();
        this.appleTree = appleTreeGenerator.generate();
        this.soil = new Soil(5.0, false);
        this.currentDay = 0;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Simulation day: " + this.currentDay + " (" + this.simulationLength + ")");
        result.add("Weather: " + this.weather);
        result.add(this.soil.toString());
        result.add("Number of apples: " + this.appleTree.apples.size());
        result.add("Apple tree: " + this.appleTree);

        return String.join("\n", result);
    }

    public void run() {
        for (int i = 0; i < simulationLength; i++) {
            Double currentGrowthRatio;
            Weather currentWeather;
            Soil currentSoil;

            currentWeather = this.weather.nextDay();
            currentSoil = this.soil.nextDay();
            currentGrowthRatio = currentWeather.growthRatio() + currentSoil.growthRatio();
            currentDay += 1;
            this.appleTree.vitality += this.appleTree.vitality * currentGrowthRatio;
            this.appleTree.apples.forEach(apple -> {
                apple.vitality += apple.vitality * currentGrowthRatio;
            });
            var healthyApples = this.appleTree.apples.
                    stream().
                    filter(apple -> apple.vitality > 1).
                    collect(Collectors.toList());
            this.appleTree.apples = new ArrayList<>(healthyApples);

            if (appleTree.vitality < 1) {
                this.appleTree.apples = new ArrayList<>();
                System.out.println("Drzewo umarło");
                break;
            }
            System.out.println("Current: " + currentGrowthRatio);
            System.out.println(this);
        }
    }
}




