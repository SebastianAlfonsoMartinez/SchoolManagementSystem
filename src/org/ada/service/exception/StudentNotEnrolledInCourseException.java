package org.ada.service.exception;

public class StudentNotEnrolledInCourseException extends Exception{
    public StudentNotEnrolledInCourseException(String message){
        super(message);
    }
}
