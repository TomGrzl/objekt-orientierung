package de.neuefische.model;

public interface Student {
    String firstName = new String();
    String lastName = new String();
    int matriculationNumber = 0;
    String subject = new String();
    String formOfExamination = new String();



    public String getName();

    public String getSubject();

    public String getFormOfExamination();

    public int getMatriculationNumber();


}
