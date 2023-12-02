package org.ada.domain.crud.interfaces;

import org.ada.domain.entity.Course;
import org.ada.domain.entity.Student;
import java.util.List;

public interface ICrudAcademic {

    void add(Course course, Student student);
    void remove(Course course, Student studentList)throws Exception;

    List<Student> findByCourseId(Integer idCourse)throws Exception;
    void findAll();
}
