package ro.fasttrackit.homework2.exercise2.persons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CategorizedPersons {
    private final HashMap<AgeStages, List<String>> categorizedPersons;

    public CategorizedPersons() {
        this.categorizedPersons = new HashMap<>();
    }

    public CategorizedPersons addPersonToResult(Person person) {
        AgeStages ageStage = AgeStages.of(person.getAge()).orElse(null);
        if (!categorizedPersons.containsKey(ageStage)) {
            categorizedPersons.put(ageStage, new ArrayList<>());
        }
        categorizedPersons.get(ageStage).add(person.getFirstName() + " " + person.getLastName());
        return this;
    }

    public HashMap<AgeStages, List<String>> getCategorizedPersons() {
        return new HashMap<>(categorizedPersons);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorizedPersons that = (CategorizedPersons) o;
        return Objects.equals(categorizedPersons, that.categorizedPersons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categorizedPersons);
    }

    @Override
    public String toString() {
        return "CategorizedPersons{" +
                "map=" + categorizedPersons +
                '}';
    }
}
