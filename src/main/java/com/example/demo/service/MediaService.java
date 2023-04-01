package com.example.demo.service;

import com.example.demo.entity.Media;

import java.util.List;

public interface MediaService {
    List<Media> list();
    Boolean deleteById(Integer id);
    Boolean update(Media media);
    Boolean insert(Media media);
}
