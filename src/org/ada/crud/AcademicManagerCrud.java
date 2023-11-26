package org.ada.crud;

import org.ada.crud.interfaces.ICrudAcademic;
import org.ada.entity.Course;
import org.ada.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcademicManagerCrud implements ICrudAcademic {
    protected final Map<Course, List<Student>> mapCoursesStudent;

    public AcademicManagerCrud() {
        this.mapCoursesStudent = new HashMap<>();
    }

    @Override
    public void add(Course course, Student student) {
        if (!mapCoursesStudent.containsKey(course)) {
            ArrayList<Student> listStudent = new ArrayList<>();
            listStudent.add(student);
            mapCoursesStudent.put(course, listStudent);
            return;
        }
        mapCoursesStudent.get(course).add(student);
    }

    @Override
    public void remove(Course course, Student student) throws Exception {
        if (!mapCoursesStudent.containsKey(course)) {
            throw new Exception("El curso no existe");
        }
        List<Student> studentInCourse = mapCoursesStudent.get(course);
        if (studentInCourse.contains(student)) {
            System.out.println("Estudiante " + student + " \nDesinscrito del curso " + course);
            studentInCourse.remove(student);
        }else
            throw new Exception("EL estudiante no esta matriculado en el curso");
    }

    @Override
    public List<Student> findByCourseId(Integer idCourse) throws Exception {
        if (!mapCoursesStudent.containsKey(idCourse)) {
            throw new Exception("El curso no tiene estudiantes matriculados");
        }
        return mapCoursesStudent.get(idCourse);
    }


    @Override
    public void findAll() {
        mapCoursesStudent.forEach((course, studentList) -> {
            System.out.println("El Curso: " + course);
            System.out.println("Tiene inscritos los siguientes estudiantes: ");
            studentList.forEach(student -> System.out.println(student));
            System.out.println("----------------------------------------");
        });
    }
}
