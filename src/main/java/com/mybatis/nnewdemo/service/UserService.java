package com.mybatis.nnewdemo.service;

import java.util.List;
import com.mybatis.nnewdemo.entity.User;
public interface UserService{

    int insert(User user);

    int insertSelective(User user);

    int insertList(List<User> users);

    int updateByPrimaryKeySelective(User user);
}
