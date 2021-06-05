package com.applesimulation;

import java.util.ArrayList;

public class Apple {
    public Double vitality;

    public Apple(Double vitality) {
        this.vitality = vitality;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Vitality: " + this.vitality + "HP");

        return "\n" + String.join("\n", result) + "\n";
    }
}
