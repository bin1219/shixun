package com.example.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

public class StudyTest {
    Date date = new Date();
    @Test
    void Test() {
        System.out.println(LocalDateTime.now());
        System.out.println(date);
    }
}
