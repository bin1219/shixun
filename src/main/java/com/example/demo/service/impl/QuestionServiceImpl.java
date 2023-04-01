package com.example.demo.service.impl;

import com.example.demo.entity.Question;
import com.example.demo.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    /**
     *
     * @return
     */
    @Override
    public List<Question> list() {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Question getById(Integer id) {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }

    /**
     *
     * @param question
     * @return
     */
    @Override
    public Boolean update(Question question) {
        return null;
    }

    /**
     *
     * @param question
     * @return
     */
    @Override
    public Boolean insert(Question question) {
        return null;
    }
}
