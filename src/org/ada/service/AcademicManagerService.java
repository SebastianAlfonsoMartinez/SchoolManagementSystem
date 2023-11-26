package org.ada.service;

import org.ada.crud.AcademicManagerCrud;
import org.ada.entity.Course;
import org.ada.entity.Student;
import org.ada.service.exception.CourseNoExistException;
import org.ada.service.exception.StudentAlreadyInscribedException;
import org.ada.service.exception.StudentNotEnrolledInCourseException;
import org.ada.service.interfaces.IAcademic;

import java.util.List;

public class AcademicManagerService extends AcademicManagerCrud implements IAcademic {

    private CourseService courseService;
    private StudentService studentService;

    public AcademicManagerService(CourseService courseService, StudentService studentService) {
        this.courseService = courseService;
        this.studentService = studentService;
    }

    @Override
    public void registerStudentCourse(Student student, Course course) throws StudentAlreadyInscribedException, CourseNoExistException {
        if (courseService.findById(course.getId()) == null) {
            throw new CourseNoExistException("Curso: " + course + " no existe");
        }
        if (studentService.findById(student.getIdStudent()) == null) {
            throw new StudentAlreadyInscribedException("El estudiante no ha sido registrado");
        }
        List<Student> studentInCourse = mapCoursesStudent.get(course);
        if (studentInCourse != null && studentInCourse.contains(student)) {
            throw new StudentAlreadyInscribedException("Estudiante ya se encuentra inscrito en el curso : " + course);
        }
        this.add(course, student);
    }


    @Override
    public void unsubscribeStudentCourse(Student student, Course course) throws Exception {
        if (courseService.findById(course.getId()) == null) {
            throw new CourseNoExistException("Curso: " + course + " no existe");
        }
        if (!this.mapCoursesStudent.containsKey(course)) {
            throw new StudentNotEnrolledInCourseException("Curso no tiene matriculas abiertas");
        }
        this.remove(course, student);
    }
}
