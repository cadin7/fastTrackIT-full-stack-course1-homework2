package ro.fasttrackit.homework2.exercise2.persons.inheritance;

import ro.fasttrackit.homework2.exercise2.persons.AgeStages;
import ro.fasttrackit.homework2.exercise2.persons.CategorizedPersons;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

abstract class PersonReportGenerator {
    public void generateReport(String outputFile) throws IOException {
        writeReport(readPersons(), outputFile);
    }

    private void writeReport(CategorizedPersons persons, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            if (!persons.getCategorizedPersons().isEmpty()) {
                writeLine(writer, persons.getCategorizedPersons());
            }
        }
    }

    private void writeLine(BufferedWriter writer, HashMap<AgeStages, List<String>> line) {
        Arrays.stream(AgeStages.values())
                .forEach(anEnum -> writeLineInOrder(writer, line, anEnum));
    }

    private void writeLineInOrder(BufferedWriter writer, HashMap<AgeStages, List<String>> line, AgeStages stage) {
        try {
            writer.write(stage.getAgeRange() +
                    line.get(stage)
                            .toString()
                            .replaceAll("(^\\[|]$)", "")
            );
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract CategorizedPersons readPersons();
}
