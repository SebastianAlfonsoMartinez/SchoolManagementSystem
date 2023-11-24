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
}
