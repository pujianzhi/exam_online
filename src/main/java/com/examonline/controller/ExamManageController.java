package com.examonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam")
public class ExamManageController {

    @RequestMapping("/index")
    public String examIndex() {
        return "/teacher/exam_index";
    }
}
