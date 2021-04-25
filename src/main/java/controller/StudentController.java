/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package controller;

import mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Student;

import java.util.List;

/**
 * @author ZijinDesktop2
 * @date 2021/4/25 18:50
 */
@Controller
public class StudentController {


    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/listStudent")
    public String listStudent(Model model){
        List<Student> students = studentMapper.findAll();
        model.addAttribute("students",students);
        return "listStudent";
    }
}
