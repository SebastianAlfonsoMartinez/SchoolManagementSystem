package org.ada.entity;

import java.time.LocalDate;

// Clase abstracta que representa a una persona
public abstract class Persona {

    protected final Integer id; // Identificador único de la persona
    protected String name; // Nombre de la persona
    protected LocalDate dateOfBirth; // Fecha de nacimiento de la persona

    // Constructor para inicializar los atributos de la persona
    public Persona(Integer id, String nameStudent, LocalDate dateOfBirth) {
        this.id = id;
        this.name = nameStudent;
        this.dateOfBirth = dateOfBirth;
    }

    // Representación en String del objeto Persona
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nameStudent='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

