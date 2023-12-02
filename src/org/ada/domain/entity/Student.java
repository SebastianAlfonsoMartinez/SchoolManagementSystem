package org.ada.domain.entity;

import java.time.LocalDate;

public class Student extends Person {
    //atributos

    private State state;

    public Student(Integer id, String nameStudent, LocalDate dateOfBirth, State state) {
        super(id, nameStudent, dateOfBirth);
        this.state = state;
    }


    public Integer getIdStudent() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("| %-5s | %-20s | %-15s | %-20s |",
                "ID: " + id, "Nombre: " +  name, "Fecha de naciemiento: " + dateOfBirth, "Estado: " + state );
    }
}
