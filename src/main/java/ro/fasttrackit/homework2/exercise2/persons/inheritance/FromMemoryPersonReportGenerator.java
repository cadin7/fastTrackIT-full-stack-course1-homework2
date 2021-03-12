package ro.fasttrackit.homework2.exercise2.persons.inheritance;

import ro.fasttrackit.homework2.exercise2.persons.CategorizedPersons;
import ro.fasttrackit.homework2.exercise2.persons.Person;

import java.util.List;

public class FromMemoryPersonReportGenerator extends PersonReportGenerator {
    @Override
    protected CategorizedPersons readPersons() {
        return new CategorizedPersons(
                List.of(
                        new Person("Han", "Solo", 33),
                        new Person("Hun", "Cute", 53),
                        new Person("Kan", "Nibal", 99),
                        new Person("Tet", "Ris", 13),
                        new Person("Teen", "AgeR", 23),
                        new Person("Ben", "Ten", 2)
                ));
    }
}
