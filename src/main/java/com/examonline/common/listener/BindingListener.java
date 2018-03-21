package com.examonline.common.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;


@Component
@Scope("prototype")
public class BindingListener implements HttpSessionBindingListener{

//    @Autowired
//    UserService userService;
//
//    private User user;
//
//    public BindingListener() {
//    }
//
//    public BindingListener(User user) {
//        this.user = user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public User getUser() {
//        return user;
//    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("创建:"+httpSessionBindingEvent.getName());
//        HttpSession httpSession = httpSessionBindingEvent.getSession();
//        ServletContext application = httpSession.getServletContext();
//        List<String> onlineUserList = (List<String>) application.getAttribute("user");
//        if(onlineUserList==null){
//            onlineUserList = new ArrayList<>();
//        }
//        onlineUserList.add(this.name);
//        application.setAttribute("onlineUserList",onlineUserList);
//        System.out.println("valueBound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
//        System.out.println("登出："+this.user.getUserno());
//        user.setLoginstatus(0);
//        userService.updateUser(user);
//        httpSessionBindingEvent.getName();
    }
}
