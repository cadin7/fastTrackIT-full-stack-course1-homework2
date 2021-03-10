package ro.fasttrackit.homework2.exercise2.persons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategorizedPersons {
    private final HashMap<AgeStages, List<String>> map;

    public CategorizedPersons() {
        this.map = new HashMap<>();
    }

    public CategorizedPersons addPersonToResult(Person person) {
        AgeStages ageStage = AgeStages.of(person.getAge()).orElse(null);
        if (!map.containsKey(ageStage)) {
            map.put(ageStage, new ArrayList<>());
        }
        map.get(ageStage).add(person.getFirstName() + " " + person.getLastName());
        return this;
    }

    public HashMap<AgeStages, List<String>> getMap() {
        return new HashMap<>(map);
    }

    @Override
    public String toString() {
        return "CategorizedPersons{" +
                "map=" + map +
                '}';
    }
}
