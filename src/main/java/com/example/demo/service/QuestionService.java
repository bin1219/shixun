package com.example.demo.service;

import com.example.demo.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> list();
    Question getById(Integer id);
    Boolean deleteById(Integer id);
    Boolean update(Question question);
    Boolean insert(Question question);
}
