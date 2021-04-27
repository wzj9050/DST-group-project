/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package cn.wmyskxz.springboot.controller;

import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ZijinDesktop2
 * @date 2021/4/22 22:15
 */
@Controller
public class DrugController {

    @Autowired
    private ServletContext servletContext;
    public ServletContext getServletContext() {
        return servletContext;
    }

    @RequestMapping("/drugs")
    public String drugs(@NotNull Model m) {

        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        String wordsList = "Type what you what you show in the file 'StudenttCotroller.java'";
        m.addAttribute("words_test", wordsList);
        String drugsContent = null;
        try {
            drugsContent = Files.readString(Path.of(getServletContext().getRealPath("/WEB-INF/drugs.data")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        Map drugs = gson.fromJson(drugsContent, Map.class);
        List<Map> drugList = (List<Map>) drugs.get("data");
        m.addAttribute("drugs", drugList);
        //这个‘s’是不需要打出来的，会自动显示
        return "drugs";
    }



    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
