package org.ada.service;

import org.ada.domain.crud.StudentCrud;
import org.ada.domain.entity.Student;

// Clase que gestiona operaciones relacionadas con estudiantes y hereda comportamientos CRUD de StudentCrud
public class StudentService extends StudentCrud {

    // Método para inscribir a un estudiante
    public void enrollStudent(Student student) {
        // Verifica si el estudiante ya está en la lista de estudiantes
        if (!this.studentsList.contains(student)) {
            // Si no está en la lista, lo agrega e imprime un mensaje de éxito
            this.studentsList.add(student);
            System.out.println("Se ha creado el estudiante: " + student);
        } else {
            // Si el estudiante ya está en la lista, imprime un mensaje indicando que ya existe
            System.out.println("El estudiante " + student + " ya existe");
        }
    }
}

