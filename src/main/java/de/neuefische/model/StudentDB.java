package de.neuefische.model;

import de.neuefische.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {
    Student[] students;


    public StudentDB(Student[] students) {
        this.students = students;

    }


    public Student[] list() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent(Student[] students) {
        int random = (int) (Math.random() * students.length);
        return students[random];
    }

    public void addStudentToArray(Student studentToAdd) {
        Student[] newStudents = new Student[(students.length + 1)];

        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }

        newStudents[(newStudents.length - 1)] = studentToAdd;
        students = newStudents;
    }

   /* public Student[] removeStudentFromArray(Student[] students, int studentId) {
        Student[] newStudents = new Student[(students.length - 1)];
        int x = IndexOf(students, studentId);

        for (int i = 0; i < (studentId-1); i++) {
            newStudents[i] = students[i];
        }
        for (int j = studentId; j < (studentId-1); j++) {
            newStudents[j] = students[j+1];
        }

        return newStudents;
    } */

    public Student[] removeStudentFromArray(int deleteId){
        int newLength = students.length-1;
        Student[] resultStudents = new Student[newLength];
        int j = 0;
        for (int i = 0; j < (resultStudents.length); i++, j++) {
            if (students[i].getMatriculationNumber() == deleteId) {
                i++;
                resultStudents[j] = students[i];
            } else {
                resultStudents[j] = students[i];}
        }
        return resultStudents;

    }
}
