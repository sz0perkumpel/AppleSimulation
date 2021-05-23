package com.applesimulation;

import java.util.ArrayList;

public class AppleTree {
    public Integer progress;
    public Integer vitality;
    public ArrayList<Apple> apples;

    public AppleTree(Integer progress, Integer vitality) {
        this.progress = progress;
        this.vitality = vitality;
        this.apples = new ArrayList<>();
    }

    public ArrayList<Apple> addApple(Apple apple) {
        apples.add(apple);
        return apples;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Apple tree progress: " + this.progress + "%");
        result.add("Apple tree vitality: " + this.vitality + "HP");
        result.add("Apples: " + this.apples);

        return String.join("\n", result) + "\n";
    }
}
