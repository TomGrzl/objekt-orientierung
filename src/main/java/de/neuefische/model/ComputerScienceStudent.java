package de.neuefische.model;

public class ComputerScienceStudent implements Student{
    String name;

    public ComputerScienceStudent(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSubject() {
        return "Informatik";
    }

    @Override
    public String getFormOfExamination() {
        return "Exam";
    }

    @Override
    public int getMatriculationNumber() {
        return matriculationNumber;
    }
}
