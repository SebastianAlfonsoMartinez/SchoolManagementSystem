package org.ada.entity;

public class Course {

    private final Integer id;
    private String nameCourse;
    private String descriptionCourse;
    private Integer numberCredits;
    private Double versionCourse;

    public Course(Integer id, String nameCourse, String descriptionCourse, Integer numberCredits, Double versionCourse) {
        this.id = id;
        this.nameCourse = nameCourse;
        this.descriptionCourse = descriptionCourse;
        this.numberCredits = numberCredits;
        this.versionCourse = versionCourse;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("| %-5s | %-20s | %-15s | %-20s | %-5s",
                "ID: " + id, "Curso: " + nameCourse, "Descripcion: " + descriptionCourse, "Numero de creditos: " + numberCredits, "Version: " +versionCourse);

    }
}
