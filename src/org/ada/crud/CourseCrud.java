package org.ada.crud;

import org.ada.crud.interfaces.IGenericCrud;
import org.ada.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseCrud implements IGenericCrud<Course> {
    protected final List<Course> coursesList ;

    public CourseCrud() {
        this.coursesList = new ArrayList<>();
    }

    @Override
    public void add(Course entity) {
        coursesList.add(entity);
    }

    @Override
    public void remove(Course entity) {
        coursesList.remove(entity);
    }

    @Override
    public Course findById(Integer id) {
        return coursesList.stream().filter(e -> e.getId() == id).findFirst().orElseThrow();
    }

    @Override
    public void findAll() {
        coursesList.forEach(course -> System.out.println("Curso: " + course));
    }
}
