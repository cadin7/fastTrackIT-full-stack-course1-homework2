package ro.fasttrackit.homework2.exercise2.persons.composition;

import ro.fasttrackit.homework2.exercise2.persons.CategorizedPersons;
import ro.fasttrackit.homework2.exercise2.persons.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReportGenerator implements PersonProvider {
    private final String sourceFile;
    private final CategorizedPersons categorizedPersons;

    public FileReportGenerator(String sourceFile) {
        this.sourceFile = sourceFile;
        this.categorizedPersons = new CategorizedPersons();
    }

    @Override
    public CategorizedPersons readPersons() {
        try {
            Files.lines(Path.of(sourceFile)).forEach(this::readPerson);
        } catch (IOException e) {
            System.out.println("Could not read from file" + sourceFile);
        }
        return categorizedPersons;
    }

    private void readPerson(String line) {
        String[] personInfo = line.split(",");
        categorizedPersons.addPersonToResult(
                new Person(
                        personInfo[0],
                        personInfo[1],
                        Integer.parseInt(personInfo[2])
                )
        );
    }
}
