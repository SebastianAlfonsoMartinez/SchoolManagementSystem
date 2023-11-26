package org.ada.service;

import org.ada.crud.CourseCrud;
import org.ada.entity.Course;

// Clase que gestiona operaciones relacionadas con cursos y hereda comportamientos CRUD de CourseCrud
public class CourseService extends CourseCrud {

    // Método para inscribir un curso
    public void enrollCourse(Course course){
        // Verifica si el curso ya está en la lista de cursos
        if (!this.coursesList.contains(course)) {
            // Si el curso no está en la lista, lo agrega e imprime un mensaje de éxito
            this.coursesList.add(course);
            System.out.println("Se ha creado el curso: " + course);
        } else {
            // Si el curso ya está en la lista, imprime un mensaje indicando que ya existe
            System.out.println("El curso " + course + " ya existe");
        }
    }
}
