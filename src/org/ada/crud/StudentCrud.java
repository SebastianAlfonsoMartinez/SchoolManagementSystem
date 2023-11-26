package org.ada.crud;

import org.ada.crud.interfaces.IGenericCrud;
import org.ada.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentCrud implements IGenericCrud<Student> {

    protected final List<Student> studentsList;

    public StudentCrud() {
        this.studentsList = new ArrayList<>();
    }

    @Override
    public void add(Student entity){
        studentsList.add(entity);
    }


    @Override
    public void remove(Student entity) {
        studentsList.remove(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentsList.stream().filter(e -> e.getIdStudent() == id).findFirst().orElseThrow();
    }

    @Override
    public void findAll() {
        studentsList.forEach(student -> System.out.println("Estudiante: " + student));
    }
}
