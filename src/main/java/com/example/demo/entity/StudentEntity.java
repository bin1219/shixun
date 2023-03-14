package com.example.demo.entity;

public class StudentEntity {
    private String student_id;
    private String name;
    private int age;

    public StudentEntity() {
    }

    public StudentEntity(String student_id, String name, int age) {
        this.student_id = student_id;
        this.name = name;
        this.age = age;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "student_id='" + student_id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
