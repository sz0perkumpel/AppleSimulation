package com.applesimulation;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Weather weather;

        System.out.println("Podaj długość symulacji: ");
        Integer simulationLength = scanner.nextInt();
        System.out.println("Podaj typ klimatu: ");
        System.out.println("[1] zimny");
        System.out.println("[2] umiarkowany");
        System.out.println("[3] suchy");
        Integer climateType = scanner.nextInt();
        System.out.println("Podaj prawdopodobieństwo złych warunków: ");
        Double disasterProbability = scanner.nextDouble();
        switch (climateType) {
            case 1:
                weather = new ColdClimate(5.0, 50, disasterProbability);
                break;
            case 2:
                weather = new ModerateClimate(20.0, 60, disasterProbability);
                break;
            case 3:
                weather = new DryClimate(35.0, 30, disasterProbability);
                break;
            default:
                weather = new Weather(20.0, 40, "unknown");
        }
        Simulation simulation = new Simulation(simulationLength, weather);
        System.out.println(simulation);
        simulation.run();
        System.out.println(simulation);
    }
}
