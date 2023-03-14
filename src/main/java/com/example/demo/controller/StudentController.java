package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Resource
    StudentService studentService;

    /**
     * 获取所有学生信息
     * @return
     */
    @GetMapping
    @CrossOrigin
    public List<StudentEntity> list(){
        return studentService.list();
    }

    /**
     * 添加学生信息
     * @param student
     * @return
     */
    @PostMapping
    @CrossOrigin
    public boolean insert(@RequestBody StudentEntity student){
        return studentService.insert(student);
    }

    /**
     * 更新指定学号学生信息
     * @param id
     * @param student
     * @return
     */
    @PutMapping
    @CrossOrigin
    public boolean updateById(@RequestParam String id, @RequestBody StudentEntity student){
        student.setStudent_id(id);
        return studentService.updateById(student);
    }

    /**
     * 删除指定学号学生信息
     * @param id
     * @return
     */
    @DeleteMapping
    @CrossOrigin
    public boolean delById(@RequestParam String id){
        return studentService.delById(id);
    }

    /**
     * 获取指定学号学生信息
     * @param stu_id
     * @return
     */
    @GetMapping("/{stu_id}")
    @CrossOrigin
    public StudentEntity getById(@PathVariable String stu_id){
        return studentService.getById(stu_id);
    }

}
