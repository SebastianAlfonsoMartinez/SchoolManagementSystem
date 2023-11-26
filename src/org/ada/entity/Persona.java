package org.ada.entity;

import java.time.LocalDate;

public abstract class Persona {

    protected final Integer id;
    protected String name;
    protected LocalDate dateOfBirth;

    public Persona(Integer id, String nameStudent, LocalDate dateOfBirth) {
        this.id = id;
        this.name = nameStudent;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nameStudent='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
