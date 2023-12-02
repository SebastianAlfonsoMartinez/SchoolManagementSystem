package org.ada.domain.crud;

import org.ada.domain.crud.interfaces.ICrudAcademic;
import org.ada.domain.entity.Course;
import org.ada.domain.entity.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase que implementa la lógica de gestión académica
public class AcademicManagerCrud implements ICrudAcademic {

    protected final Map<Course, List<Student>> mapCoursesStudent; // Mapa que mantiene estudiantes por curso

    // Constructor que inicializa el mapa
    public AcademicManagerCrud() {
        this.mapCoursesStudent = new HashMap<>();
    }

    // Método para agregar un estudiante a un curso
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

    // Método para desinscribir un estudiante de un curso
    @Override
    public void remove(Course course, Student student) throws Exception {
        if (!mapCoursesStudent.containsKey(course)) {
            throw new Exception("El curso no existe");
        }
        List<Student> studentInCourse = mapCoursesStudent.get(course);
        if (studentInCourse.contains(student)) {
            System.out.println("Estudiante " + student + " \nDesinscrito del curso " + course);
            studentInCourse.remove(student);
        } else {
            throw new Exception("El estudiante no está matriculado en el curso");
        }
    }

    // Método para encontrar estudiantes por ID de curso
    @Override
    public List<Student> findByCourseId(Integer idCourse) throws Exception {
        if (!mapCoursesStudent.containsKey(idCourse)) {
            throw new Exception("El curso no tiene estudiantes matriculados");
        }
        return mapCoursesStudent.get(idCourse);
    }

    // Método para mostrar todos los cursos con sus estudiantes
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
