package com.yyh.student.controller;

import com.yyh.student.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: 鄢意辉
 * Date: 2019/11/6/006
 * Time: 15:24
 */
@RestController
public class Test {
    @RequestMapping("/getone")
    public Student getStudent() {
        Student student = new Student();
        student.setName("yyh");
        return student;
    }
}
