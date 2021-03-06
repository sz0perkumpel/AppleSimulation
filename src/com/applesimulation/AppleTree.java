package com.applesimulation;

import java.util.ArrayList;

/**
 * Klasa odpowiedzialna za atrybuty i metody zwiazane z jablonia
 */
public class AppleTree {
    public Double vitality;
    public ArrayList<Apple> apples;

    public AppleTree(Double vitality) {
        this.vitality = vitality;
        this.apples = new ArrayList<>();
    }

    public ArrayList<Apple> addApple(Apple apple) {
        apples.add(apple);
        return apples;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Ilość życia: " + this.vitality + " HP");
        //result.add("Jabłka: " + this.apples);

        return String.join("\n", result) + "\n";
    }
}
