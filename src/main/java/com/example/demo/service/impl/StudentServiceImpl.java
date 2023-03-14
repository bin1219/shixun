package com.example.demo.service.impl;

import com.example.demo.entity.StudentEntity;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Override
    public List<StudentEntity> list() {
        return studentMapper.list();
    }

    @Override
    public StudentEntity getById(String student_id) {
        return studentMapper.getById(student_id);
    }

    @Override
    public boolean delById(String id) {
        return studentMapper.delById(id);
    }

    @Override
    public boolean updateById(StudentEntity student) {
        return studentMapper.updateById(student);
    }

    @Override
    public boolean insert(StudentEntity student) {
        return studentMapper.insert(student);
    }
}
