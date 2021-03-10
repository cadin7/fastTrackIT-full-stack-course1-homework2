package ro.fasttrackit.homework2.exercise2.persons.inheritance;

import ro.fasttrackit.homework2.exercise2.persons.CategorizedPersons;
import ro.fasttrackit.homework2.exercise2.persons.Person;

public class FromMemoryPersonReportGenerator extends PersonReportGenerator {
    @Override
    protected CategorizedPersons readPersons() {
        return new CategorizedPersons()
                .addPersonToResult(new Person("Han", "Solo", 33))
                .addPersonToResult(new Person("Hun", "Cute", 53))
                .addPersonToResult(new Person("Kan", "Nibal", 99))
                .addPersonToResult(new Person("Tet", "Ris", 13))
                .addPersonToResult(new Person("Teen", "AgeR", 23))
                .addPersonToResult(new Person("Ben", "Ten", 2));
    }
}
