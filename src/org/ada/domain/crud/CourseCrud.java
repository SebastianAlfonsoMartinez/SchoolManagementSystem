package org.ada.domain.crud;

import org.ada.domain.crud.interfaces.IGenericCrud;
import org.ada.domain.entity.Course;
import java.util.ArrayList;
import java.util.List;

// Clase que implementa las operaciones CRUD para cursos
public class CourseCrud implements IGenericCrud<Course> {

    protected final List<Course> coursesList; // Lista que almacena cursos

    // Constructor que inicializa la lista de cursos
    public CourseCrud() {
        this.coursesList = new ArrayList<>();
    }

    // Método para agregar un curso a la lista
    @Override
    public void add(Course entity) {
        coursesList.add(entity);
    }

    // Método para eliminar un curso de la lista
    @Override
    public void remove(Course entity) {
        coursesList.remove(entity);
    }

    // Método para buscar un curso por su ID
    @Override
    public Course findById(Integer id) {
        // Busca el curso por ID, si no lo encuentra, lanza una excepción
        return coursesList.stream().filter(e -> e.getId() == id).findFirst().orElseThrow();
    }

    // Método para imprimir todos los cursos en la lista
    @Override
    public void findAll() {
        coursesList.forEach(course -> System.out.println("Curso: " + course));
    }
}
