/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package cn.wmyskxz.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author ZijinDesktop2
 * @date 2021/4/22 22:15
 */
@Controller
public class HelloController {




    //    @Autowired
//    private StudentProperties studentProperties;
    @RequestMapping("/hello")
    public String hello(@org.jetbrains.annotations.NotNull Model m) {
//        return studentProperties.getName() + "test for the hot deployment"+ studentProperties.getAge();

        m.addAttribute( "now", DateFormat.getDateTimeInstance().format(new Date()));
//这个‘s’是不需要打出来的，会自动显示
        return "hello";
    }
}
