package de.neuefische.model;

public class HistoryStudent implements Student{
    String name;

    public HistoryStudent(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSubject() {
        return "History";
    }

    @Override
    public String getFormOfExamination() {
        return "Assignment";
    }

    @Override
    public int getMatriculationNumber() {
    return 0;
    }
}
