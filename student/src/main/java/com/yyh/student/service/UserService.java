package com.yyh.student.service;

import com.yyh.student.entity.User;
import com.yyh.student.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: 鄢意辉
 * Date: 2019/11/7/007
 * Time: 15:57
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(String username,String password){
        return userMapper.selectUser(username,password);
    }
}
