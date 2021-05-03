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

        apples.add(new Apple("Gala", "red", 4, 95, "small", 90, 100));
        apples.add(new Apple("Ligol", "bright red", 49, 50, "big", 95, 100));
        apples.add(new Apple("Lobo", "green-yellow", 55, 44, "medium", 15, 100));
        apples.add(new Apple("Gloster", "carmine", 39, 60, "big", 50, 100));
        apples.add(new Apple("Szampion", "yellow-red", 4, 95, "big", 85, 100));
        apples.add(new Apple("Antonówka", "light yellow", 24, 75, "medium", 83, 100));
        apples.add(new Apple("Szara Reneta", "gray-olive", 49, 50, "big", 90, 100));
        apples.add(new Apple("Gortland", "green", 35, 64, "medium", 75, 100));
        apples.add(new Apple("Kosztela", "red", 94, 5, "medium", 100, 100));
        apples.add(new Apple("Malinowa Oberlandzka", "light purple", 4, 95, "big", 85, 100));
        apples.add(new Apple("Rubin", "orange", 9, 90, "big", 50, 100));
        apples.add(new Apple("Delikates", "green-yellow", 49, 50, "big", 50, 100));
        apples.add(new Apple("Paulared", "red-green", 49, 50, "small", 75, 100));
        apples.add(new Apple("Papierówka", "light yellow", 64, 35, "medium", 50, 100));
        apples.add(new Apple("Jonagold", "green-yellow", 19, 80, "big", 60, 100));
        apples.add(new Apple("Golden Delicious", "green-yellow", 13, 86, "medium", 70, 100));
        apples.add(new Apple("Wilton's Star", "creamy yellow", 12, 87, "medium", 93, 100));
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Apple tree progress: " + this.progress + "%");
        result.add("Apple tree vitality: " + this.vitality + "HP");
        result.add("Apples: " + this.apples);

        return String.join("\n", result) + "\n";
    }
}
