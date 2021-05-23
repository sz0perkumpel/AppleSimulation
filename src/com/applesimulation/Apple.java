package com.applesimulation;

import java.util.ArrayList;

public class Apple {
    public Integer progress;
    public Integer vitality;

    public Apple(Integer progress, Integer vitality) {
        this.progress = progress;
        this.vitality = vitality;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Progress: " + this.progress + "%");
        result.add("Vitality: " + this.vitality + "HP");

        return "\n" + String.join("\n", result) + "\n";
    }
}
