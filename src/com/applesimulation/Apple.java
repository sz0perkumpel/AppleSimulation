package com.applesimulation;

import java.util.ArrayList;

public class Apple {
    public String variety;
    public String colour;
    public Integer acidity;
    public Integer sweetness;
    public String size;
    public Integer hardness;
    public Integer vitality;

    public Apple(String variety, String  colour, Integer acidity, Integer sweetness, String size, Integer hardness, Integer vitality) {
        this.variety = variety;
        this.colour = colour;
        this.acidity = acidity;
        this.sweetness = sweetness;
        this.size = size;
        this.hardness = hardness;
        this.vitality = vitality;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Variety: " + this.variety);
        result.add("Colour: " + this.colour);
        result.add("Acidity: " + this.acidity);
        result.add("Sweetness: " + this.sweetness);
        result.add("Size: " + this.size);
        result.add("Hardness: " + this.hardness);
        result.add("Vitality: " + this.vitality);

        return String.join("\n", result) + "\n";
    }
}
