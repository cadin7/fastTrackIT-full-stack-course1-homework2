package ro.fasttrackit.homework2.exercise2.persons;

import java.util.*;

public class CategorizedPersons {
    private final Map<AgeStages, List<String>> categorizedPersons = new HashMap<>();

    public CategorizedPersons(List<Person> persons) {
        Arrays.stream(AgeStages.values())
                .forEach(ageStage -> categorizedPersons.put(ageStage, new ArrayList<>()));
        persons.forEach(this::addPerson);
    }

    private void addPerson(Person person) {
        AgeStages ageStage = AgeStages.of(person.getAge());
        categorizedPersons.get(ageStage)
                .add(person.getFirstName() + " " + person.getLastName());
    }

    public HashMap<AgeStages, List<String>> getCategorizedPersons() {
        return new HashMap<>(categorizedPersons);
    }
}
