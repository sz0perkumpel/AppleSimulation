package com.applesimulation;

import java.util.ArrayList;
import java.util.Random;

public class Soil {
    public Double pH;
    public Boolean fertilizerPresence;

    public Soil(Double pH, Boolean fertilizerPresence) {
        this.pH = pH;
        this.fertilizerPresence = fertilizerPresence;
    }

    public Double fertilizerGrowthRatio() {
        if (fertilizerPresence) {
            return 0.2;
        } else {
            return 0.0;
        }
    }

    public Double growthRatio() {
        if (pH >= 5.5 && pH <= 7.5) {
            return 0.1 + fertilizerGrowthRatio();
        } else {
            return 0.05 + fertilizerGrowthRatio();
        }
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("PH of soil: " + this.pH);
        result.add("Does the soil have fertilizer: " + this.fertilizerPresence);

        return "\n" + String.join("\n", result) + "\n";
    }

    public Soil nextDay() {
        this.pH = new Random().nextDouble() * 10;

        return this;
    }
}


