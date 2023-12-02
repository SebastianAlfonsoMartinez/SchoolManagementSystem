package org.ada.service;

import org.ada.domain.crud.AcademicManagerCrud;
import org.ada.domain.entity.Course;
import org.ada.domain.entity.Student;
import org.ada.exception.CourseNoExistException;
import org.ada.exception.StudentAlreadyInscribedException;
import org.ada.exception.StudentNotEnrolledInCourseException;
import org.ada.service.interfaces.IAcademic;

import java.util.List;

// Clase que gestiona operaciones académicas y hereda comportamientos CRUD de AcademicManagerCrud e implementa IAcademic
public class AcademicManagerService extends AcademicManagerCrud implements IAcademic {

    private CourseService courseService;
    private StudentService studentService;

    // Constructor que recibe instancias de CourseService y StudentService para la gestión de cursos y estudiantes
    public AcademicManagerService(CourseService courseService, StudentService studentService) {
        this.courseService = courseService;
        this.studentService = studentService;
    }

    // Método para inscribir a un estudiante en un curso
    @Override
    public void registerStudentCourse(Student student, Course course) throws StudentAlreadyInscribedException, CourseNoExistException {
        // Verifica si el curso existe en la base de datos de cursos
        if (courseService.findById(course.getId()) == null) {
            throw new CourseNoExistException("Curso: " + course + " no existe");
        }
        // Verifica si el estudiante está registrado en la base de datos de estudiantes
        if (studentService.findById(student.getIdStudent()) == null) {
            throw new StudentAlreadyInscribedException("El estudiante no ha sido registrado");
        }
        // Obtiene la lista de estudiantes inscritos en el curso
        List<Student> studentInCourse = mapCoursesStudent.get(course);
        // Verifica si el estudiante ya está inscrito en el curso
        if (studentInCourse != null && studentInCourse.contains(student)) {
            throw new StudentAlreadyInscribedException("Estudiante ya se encuentra inscrito en el curso : " + course);
        }
        // Agrega al estudiante al curso
        this.add(course, student);
    }

    // Método para desinscribir a un estudiante de un curso
    @Override
    public void unsubscribeStudentCourse(Student student, Course course) throws Exception {
        // Verifica si el curso existe en la base de datos de cursos
        if (courseService.findById(course.getId()) == null) {
            throw new CourseNoExistException("Curso: " + course + " no existe");
        }
        // Verifica si el curso tiene matrículas abiertas
        if (!this.mapCoursesStudent.containsKey(course)) {
            throw new StudentNotEnrolledInCourseException("Curso no tiene matriculas abiertas");
        }
        // Remueve al estudiante del curso
        this.remove(course, student);
    }
}
