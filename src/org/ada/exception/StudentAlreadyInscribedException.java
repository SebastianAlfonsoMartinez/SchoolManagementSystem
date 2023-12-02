package org.ada.exception;

// Excepción personalizada para cuando un estudiante ya está inscrito en un curso
public class StudentAlreadyInscribedException extends Exception {

    // Constructor que recibe un mensaje de error
    public StudentAlreadyInscribedException(String message) {
        super(message);
    }
}

