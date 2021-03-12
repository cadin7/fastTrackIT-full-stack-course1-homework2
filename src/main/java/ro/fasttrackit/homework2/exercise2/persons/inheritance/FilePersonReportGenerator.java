package ro.fasttrackit.homework2.exercise2.persons.inheritance;

import ro.fasttrackit.homework2.exercise2.persons.CategorizedPersons;
import ro.fasttrackit.homework2.exercise2.persons.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilePersonReportGenerator extends PersonReportGenerator {
    private final String sourceFile;

    public FilePersonReportGenerator(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    @Override
    public CategorizedPersons readPersons() {
        try {
            return new CategorizedPersons(
                    Files.lines(Path.of(sourceFile))
                            .map(this::readPerson)
                            .collect(toList())
            );
        } catch (IOException e) {
            System.out.println("Could not read from file" + sourceFile);
        }
        return new CategorizedPersons(List.of());
    }

    private Person readPerson(String line) {
        String[] personInfo = line.split(",");
        return new Person(
                personInfo[0],
                personInfo[1],
                Integer.parseInt(personInfo[2])
        );
    }
}
