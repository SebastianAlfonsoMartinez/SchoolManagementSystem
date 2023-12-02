package org.ada.service.interfaces;

import org.ada.domain.entity.Course;
import org.ada.domain.entity.Student;
import org.ada.exception.CourseNoExistException;
import org.ada.exception.StudentAlreadyInscribedException;

// Interfaz que define métodos académicos para la gestión de estudiantes y cursos
public interface IAcademic {

    // Método para inscribir a un estudiante en un curso
    void registerStudentCourse(Student student, Course course) throws StudentAlreadyInscribedException, CourseNoExistException;

    // Método para desinscribir a un estudiante de un curso
    void unsubscribeStudentCourse(Student student, Course course) throws Exception;
}
