package ro.fasttrackit.homework2.exercise1.enums;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet.allOf(CelestialBodies.class)
                .forEach(Main::printWeight);
    }

    private static void printWeight(CelestialBodies celestialBody) {
        System.out.println(
                String.format("%.2f",
                        celestialBody.calculateWeight(66.5)) +
                        "kg on " +
                        celestialBody.name()
        );
    }
}
