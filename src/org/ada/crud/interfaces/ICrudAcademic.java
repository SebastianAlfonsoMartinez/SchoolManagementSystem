package org.ada.crud.interfaces;

import org.ada.entity.Course;
import org.ada.entity.Student;
import java.util.List;

public interface ICrudAcademic {

    void add(Course course, Student student);
    void remove(Course course, Student studentList)throws Exception;

    List<Student> findByCourseId(Integer idCourse)throws Exception;
    void findAll();
}
