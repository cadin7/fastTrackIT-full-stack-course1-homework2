package ro.fasttrackit.homework2.exercise2.persons;

import ro.fasttrackit.homework2.exercise2.persons.composition.FileReportGenerator;
import ro.fasttrackit.homework2.exercise2.persons.composition.FromMemoryReportGenerator;
import ro.fasttrackit.homework2.exercise2.persons.composition.ReportGenerator;
import ro.fasttrackit.homework2.exercise2.persons.inheritance.FilePersonReportGenerator;
import ro.fasttrackit.homework2.exercise2.persons.inheritance.FromMemoryPersonReportGenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var compFileGenerator = new FileReportGenerator("src/main/resources/people.txt");
        new ReportGenerator(compFileGenerator).generateReport("comp_file.txt");

        FromMemoryReportGenerator compMemoryGenerator = new FromMemoryReportGenerator();
        new ReportGenerator(compMemoryGenerator).generateReport("comp_memory.txt");


        var inhFileGenerator = new FilePersonReportGenerator("src/main/resources/people.txt");
        inhFileGenerator.generateReport("inh_file.txt");

        new FromMemoryPersonReportGenerator().generateReport("inh_memory.txt");
    }
}
