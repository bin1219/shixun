package com.example.demo.service;

import com.example.demo.entity.Knowledge;
import com.example.demo.entity.Question;

import java.util.List;

public interface KnowledgeService {
    List<Knowledge> list();
    Boolean deleteById(Integer id);
    Boolean insert(Knowledge knowledge, Question question);
    Boolean update(Knowledge knowledge, Question question);
    Knowledge getById(Knowledge knowledge);
}
