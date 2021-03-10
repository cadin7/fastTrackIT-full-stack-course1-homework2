package ro.fasttrackit.homework2.exercise1.enums;

public enum CelestialBodies {
    MERCURY(0.3),
    VENUS(0.9),
    MOON(0.1),
    MARS(0.3),
    JUPITER(2.5),
    SATURN(1),
    URANUS(0.8),
    NEPTUNE(1.1),
    PLUTO(0),
    IO(0.18),
    EUROPA(0.13),
    GANYMEDE(0.14),
    CALLISTO(0.12),
    SUN(27),
    WHITE_DWARF(1300000);

    private static final double NEWTON = 9.81;
    private final double gravity;

    CelestialBodies(double gravity) {
        this.gravity = gravity;
    }

    public double calculateWeight(double weight) {
        return weight / NEWTON * gravity;
    }
}