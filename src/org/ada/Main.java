package org.ada;

import org.ada.domain.entity.Course;
import org.ada.domain.entity.State;
import org.ada.domain.entity.Student;
import org.ada.service.AcademicManagerService;
import org.ada.service.CourseService;
import org.ada.service.StudentService;
import org.ada.exception.CourseNoExistException;
import org.ada.exception.StudentAlreadyInscribedException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        CourseService courseService = new CourseService();
        StudentService studentService = new StudentService();

        AcademicManagerService academicManagerService = new AcademicManagerService(courseService, studentService);

        Student student = new Student(1, "Pepillo", LocalDate.of(1994,11,04), State.GRADUADO);
        Student student1 = new Student(2, "Grillo", LocalDate.of(2000, 4,16),State.MATRICULADO);
        Course course = new Course(1, "Java", "POO", 100, 1.1);
        Course course1 = new Course(2, "Java", "Springboot", 100, 1.5);

        courseService.enrollCourse(course);
        studentService.enrollStudent(student);
        studentService.enrollStudent(student1);


        try {
            academicManagerService.registerStudentCourse(student, course);
            academicManagerService.registerStudentCourse(student1, course);
            System.out.println("\nPrueba de ingresar nuevamente el mismo estudiante a un curso : ");
            academicManagerService.registerStudentCourse(student, course);
        } catch (StudentAlreadyInscribedException e) {
            System.out.println("Estudiante ya inscrito \n");
            e.printStackTrace();
        } catch (CourseNoExistException e) {
            System.out.println("Courso no existe" + e);
            e.printStackTrace();
        }


        academicManagerService.findAll();

        System.out.println("|---------------------------------------------------------------------------------------------------|");
        try {
            academicManagerService.unsubscribeStudentCourse(student1, course);
            System.out.println("\nPrueba de eliminar estudiante a un curso en el cual no esta : ");
            academicManagerService.unsubscribeStudentCourse(student1, course);
        } catch (Exception e) {
            System.out.println("Estudiante no inscrito en el curso");
            e.printStackTrace();
        }
        System.out.println("|---------------------------------------------------------------------------------------------------|");
        academicManagerService.findAll();
    }


}