package org.ada.service.exception;

public class StudentAlreadyInscribedException extends Exception{

    public StudentAlreadyInscribedException(String message){
        super(message);
    }
}
