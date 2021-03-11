package ro.fasttrackit.homework2.exercise2.persons;

import java.util.Optional;
import java.util.stream.Stream;

public enum AgeStages {
    YOUNG(1, 30),
    MIDDLE(31, 50),
    SENIOR(51, Integer.MAX_VALUE);

    private final int minAge;
    private final int maxAge;
    private final String ageRange;

    AgeStages(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        if (maxAge == Integer.MAX_VALUE) {
            this.ageRange = getMinAge() + "+: ";
        } else {
            this.ageRange = getMinAge() + "-" + getMaxAge() + ": ";
        }
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

    public String getAgeRange() {
        return ageRange;
    }

}
