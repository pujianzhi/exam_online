package com.examonline.service;

import com.examonline.common.entity.User;

import java.util.Map;

public interface UserService {
    Map<String,Object> isLogin(User user);

    User getUser(User user);
}
