package com.applesimulation;

import java.util.ArrayList;

/**
 * Klasa odpowiedzialna za atrybuty i metody zwiazane z jablkami
 */
public class Apple {
    public Double vitality;

    public Apple(Double vitality) {
        this.vitality = vitality;
    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();
        result.add("Ilość życia: " + this.vitality + " HP");

        return "\n" + String.join("\n", result) + "\n";
    }
}
