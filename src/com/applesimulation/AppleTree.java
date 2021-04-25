package com.applesimulation;

import java.util.ArrayList;

public class AppleTree {
    public Integer progress;
    public Integer vitality;

    public AppleTree(Integer progress, Integer vitality) {
        this.progress= progress;
        this.vitality= vitality;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Apple tree progress: " + this.progress + "%");
        result.add("Apple tree vitality: " + this.vitality + "HP");

        return String.join("\n", result) + "\n";
    }
}
