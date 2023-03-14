package com.example.demo.mapper;

import com.example.demo.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<StudentEntity> list();
    StudentEntity getById(String student_id);
    boolean delById(String id);
    boolean updateById(StudentEntity student);
    boolean insert(StudentEntity student);
}
