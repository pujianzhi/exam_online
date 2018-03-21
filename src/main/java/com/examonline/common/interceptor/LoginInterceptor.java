package com.examonline.common.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

//    @Autowired
//    UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        String url = httpServletRequest.getRequestURI();
////        System.out.println(url);
//
//        //获取Session
//        HttpSession session = httpServletRequest.getSession();
//        User user = (User) session.getAttribute("user");
//        System.out.println("user:"+user);
//        if(user != null && user.equals(userService.getUser(user))){
////            System.out.println("相等");
//            return true;
//        }else if (user!=null && !user.equals(userService.getUser(user))){
//            if(user.getRole().equals(userService.getUser(user).getRole())){
//                session.removeAttribute("user");
//            }
//
////            System.out.println("不相等");
//        }
//        //URL:login.jsp是公开的;这个demo是除了login.jsp是可以公开访问的，其它的URL都进行拦截控制
//        if(url.indexOf("/user/login")>=0){
//            return true;
//        }
//        if(url.indexOf("/static/")>=0){
//            return true;
//        }
//        //不符合条件的，跳转到登录界面
//        httpServletRequest.getRequestDispatcher("/index.jsp").forward(httpServletRequest, httpServletResponse);
//        return false;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
