package com.example.demo.service.impl;

import com.example.demo.entity.Knowledge;
import com.example.demo.entity.Question;
import com.example.demo.service.KnowledgeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeServiceImpl implements KnowledgeService {
    /**
     *
     * @return
     */
    @Override
    public List<Knowledge> list() {
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
     * @param knowledge
     * @param question
     * @return
     */
    @Override
    public Boolean insert(Knowledge knowledge, Question question) {
        return null;
    }

    /**
     *
     * @param knowledge
     * @param question
     * @return
     */
    @Override
    public Boolean update(Knowledge knowledge, Question question) {
        return null;
    }

    /**
     *
     * @param knowledge
     * @return
     */
    @Override
    public Knowledge getById(Knowledge knowledge) {
        return null;
    }
}
