package com.examonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comment")
public class CommentManageController {

    @RequestMapping("/index")
    public String commnetManageIndex(){
        return "/teacher/comment_index";
    }
}
