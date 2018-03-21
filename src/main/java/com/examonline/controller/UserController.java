package com.examonline.controller;

import com.examonline.common.entity.User;
import com.examonline.common.util.GraphicHelper;
import com.examonline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response) {
        final int width = 130; // 图片宽度
        final int height = 40; // 图片高度
        final String imgType = "jpeg"; // 指定图片格式 (不是指MIME类型)
        OutputStream output = null; // 获得可以向客户端返回图片的输出流
        try {
            output = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // (字节流)
        // 创建验证码图片并返回图片上的字符串
        if (output != null) {
            String code = GraphicHelper.create(width, height, imgType, output);
//            System.out.println("验证码内容: " + code);
            request.getSession().setAttribute("code", code);
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Object isLogin(String eouNo, String passWord, String checkCode, HttpServletRequest request) {
        User user = new User();
        user.setEouNo(eouNo);
        user.setPassWord(passWord);
        String temp = (String) request.getSession().getAttribute("code");
//        System.out.println(temp + ":" + checkCode);
        Map<String, Object> map = userService.isLogin(user);
        if (checkCode != null) {
            if (!temp.equals(checkCode)) {
                map.put("isGo", false);
                map.put("msg", "验证码错误！");
            }else {

            }
        }else {
            if ((Boolean) map.get("isGo")) {
                request.getSession().setAttribute("user",userService.getUser(user));
            }
        }
        System.out.println(user);
        return map;
    }
}
