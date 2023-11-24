package org.ada.entity;

public class Student {
    //atributos
    private final Integer idStudent;
    private String nameStudent;
    private String state;

    public Student(Integer idStudent, String nameStudent, String state) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.state = state;
    }
}
