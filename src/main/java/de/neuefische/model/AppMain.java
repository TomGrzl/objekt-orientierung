package de.neuefische.model;

public class AppMain {

    public static void main(String[] args) {
        Student[] students = {
                new ComputerScienceStudent("Franz"),
                new HistoryStudent("Jochen")
        };

        printFormOfExamination(students);


    }

    public static void printFormOfExamination(Student[] students) {
        for (int i = 0; i< students.length; i++) {
            System.out.println(students[i].getName());
            System.out.println(students[i].getFormOfExamination());

        }


    }

}
