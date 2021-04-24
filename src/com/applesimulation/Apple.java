package com.applesimulation;

import java.util.ArrayList;

public class Apple {
    public String colour;
    public Integer acidity;
    public Integer sweetness;

    public Apple(String colour, Integer acidity, Integer sweetness) {
        this.colour = colour;
        this.acidity = acidity;
        this.sweetness = sweetness;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Colour: " + this.colour);
        result.add("Acidity: " + this.acidity);
        result.add("Sweetness: " + this.sweetness);

        return String.join("\n", result) + "\n";
    }
}
