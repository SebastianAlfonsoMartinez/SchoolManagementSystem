package org.ada.exception;

// Excepción personalizada para cuando un curso no existe
public class CourseNoExistException extends Exception {

    // Constructor que recibe un mensaje de error
    public CourseNoExistException(String message){
        super(message);
    }
}

