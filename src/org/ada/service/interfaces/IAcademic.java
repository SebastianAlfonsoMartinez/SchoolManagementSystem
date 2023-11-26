package org.ada.service.interfaces;

import org.ada.entity.Course;
import org.ada.entity.Student;
import org.ada.service.exception.CourseNoExistException;
import org.ada.service.exception.StudentAlreadyInscribedException;
import org.ada.service.exception.StudentNotEnrolledInCourseException;

public interface IAcademic<T> {

    void registerStudentCourse(Student student, Course course) throws StudentAlreadyInscribedException, CourseNoExistException;
    void unsubscribeStudentCourse(Student student, Course course) throws Exception;
}
