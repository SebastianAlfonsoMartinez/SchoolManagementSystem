package org.ada.service;


import org.ada.crud.CourseCrud;
import org.ada.entity.Course;

public class CourseService extends CourseCrud {

    public void enrollCourse(Course course){
        if (!this.coursesList.contains(course)) {
            this.coursesList.add(course);
            System.out.println("Se a creado el curso: " + course);
        } else
            System.out.println("El curso " + course + "ya esta existe");
    }


}
