package org.ada.entity;

// Clase que representa un curso
public class Course {

    private final Integer id; // Identificador único del curso
    private String nameCourse; // Nombre del curso
    private String descriptionCourse; // Descripción del curso
    private Integer numberCredits; // Número de créditos del curso
    private Double versionCourse; // Versión del curso

    // Constructor para inicializar los atributos del curso
    public Course(Integer id, String nameCourse, String descriptionCourse, Integer numberCredits, Double versionCourse) {
        this.id = id;
        this.nameCourse = nameCourse;
        this.descriptionCourse = descriptionCourse;
        this.numberCredits = numberCredits;
        this.versionCourse = versionCourse;
    }

    // Método para obtener el ID del curso
    public Integer getId() {
        return id;
    }

    // Representación en String del objeto Curso
    @Override
    public String toString() {
        return String.format("| %-5s | %-20s | %-15s | %-20s | %-5s",
                "ID: " + id, "Curso: " + nameCourse, "Descripcion: " + descriptionCourse, "Numero de creditos: " + numberCredits, "Version: " + versionCourse);
    }
}
