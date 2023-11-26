package org.ada.crud;

import org.ada.crud.interfaces.IGenericCrud;
import org.ada.entity.Student;
import java.util.ArrayList;
import java.util.List;

// Clase que implementa las operaciones CRUD para estudiantes
public class StudentCrud implements IGenericCrud<Student> {

    protected final List<Student> studentsList; // Lista que almacena estudiantes

    // Constructor que inicializa la lista de estudiantes
    public StudentCrud() {
        this.studentsList = new ArrayList<>();
    }

    // Método para agregar un estudiante a la lista
    @Override
    public void add(Student entity){
        studentsList.add(entity);
    }

    // Método para eliminar un estudiante de la lista
    @Override
    public void remove(Student entity) {
        studentsList.remove(entity);
    }

    // Método para buscar un estudiante por su ID
    @Override
    public Student findById(Integer id) {
        // Busca el estudiante por ID, si no lo encuentra, lanza una excepción
        return studentsList.stream().filter(e -> e.getIdStudent() == id).findFirst().orElseThrow();
    }

    // Método para imprimir todos los estudiantes en la lista
    @Override
    public void findAll() {
        studentsList.forEach(student -> System.out.println("Estudiante: " + student));
    }
}
