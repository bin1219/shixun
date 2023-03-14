package com.example.demo.service;

import com.example.demo.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> list();
    StudentEntity getById(String student_id);
    boolean delById(String id);
    boolean updateById(StudentEntity student);
    boolean insert(StudentEntity student);
}
