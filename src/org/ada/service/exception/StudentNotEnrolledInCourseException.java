package org.ada.service.exception;

// Excepción personalizada para cuando un estudiante no está inscrito en un curso
public class StudentNotEnrolledInCourseException extends Exception {

    // Constructor que recibe un mensaje de error
    public StudentNotEnrolledInCourseException(String message) {
        super(message);
    }
}

