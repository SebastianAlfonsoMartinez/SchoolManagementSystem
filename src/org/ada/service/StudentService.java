package org.ada.service;

import org.ada.crud.StudentCrud;
import org.ada.entity.Student;


public class StudentService extends StudentCrud {

    public void enrollStudent(Student student) {
        if (!this.studentsList.contains(student)) {
            this.studentsList.add(student);
            System.out.println("Se a creado el estudiante: " + student);
        } else
            System.out.println("El estudiante " + student + "ya esta existe");
    }

}
