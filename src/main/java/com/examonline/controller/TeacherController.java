package com.examonline.controller;


import com.examonline.common.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @RequestMapping("/index")
    public String teacherIndex(@SessionAttribute("user")User user, Model model){
        model.addAttribute("user",user);
        return "/teacher/teacher_index";
    }
}
