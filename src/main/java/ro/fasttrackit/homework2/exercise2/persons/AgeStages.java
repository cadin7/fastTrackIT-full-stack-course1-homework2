package ro.fasttrackit.homework2.exercise2.persons;

import java.util.Optional;
import java.util.stream.Stream;

public enum AgeStages {
    YOUNG(1, 30),
    MIDDLE(31, 50),
    SENIOR(51, 150);

    private final int minAge;
    private final int maxAge;

    AgeStages(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public static Optional<AgeStages> of(int personAge) {
        return Stream.of(values())
                .filter(val -> personAge > val.getMinAge() && personAge <= val.getMaxAge())
                .findFirst();
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }
}
