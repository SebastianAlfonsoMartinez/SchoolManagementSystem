package org.ada.service.interfaces;

import org.ada.entity.Course;
import org.ada.entity.Student;
import org.ada.service.exception.CourseNoExistException;
import org.ada.service.exception.StudentAlreadyInscribedException;

// Interfaz que define métodos académicos genéricos para la gestión de estudiantes y cursos
public interface IAcademic<T> {

    // Método para inscribir a un estudiante en un curso
    void registerStudentCourse(Student student, Course course) throws StudentAlreadyInscribedException, CourseNoExistException;

    // Método para desinscribir a un estudiante de un curso
    void unsubscribeStudentCourse(Student student, Course course) throws Exception;
}
