package com.examonline.service;


import com.examonline.common.entity.User;
import com.examonline.common.entity.UserExample;
import com.examonline.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Map<String, Object> isLogin(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andEouNoEqualTo(user.getEouNo());
        List<User> userList = userMapper.selectByExample(example);
        Map<String, Object> map = new HashMap<>();
        map.put("isGo",false);
        if (userList != null && userList.size() > 0) {
            User temp = userList.get(0);
            if (!temp.getPassWord().equals(user.getPassWord())) {
                map.put("msg", "密码错误！");
            } else {
                map.put("isGo", true);
                if(temp.getUserType()==null){
                    map.put("url","/student/index");
                }else if (temp.getUserType()==1){
                    map.put("url","/teacher/index");
                }
            }
        }else {
            map.put("msg", "用户不存在！");
        }
        return map;
    }

    @Override
    public User getUser(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andEouNoEqualTo(user.getEouNo().trim());
        List<User> userList = userMapper.selectByExample(example);
        if(userList!=null&&userList.size()>0){
            return userList.get(0);
        }
        return null;
    }
}
