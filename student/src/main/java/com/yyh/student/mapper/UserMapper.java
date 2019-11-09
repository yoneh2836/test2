package com.yyh.student.mapper;

import com.yyh.student.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * User: 鄢意辉
 * Date: 2019/11/7/007
 * Time: 15:47
 */
@Mapper
@Component
public interface UserMapper {
    public User selectUser(String username,String password);
}
