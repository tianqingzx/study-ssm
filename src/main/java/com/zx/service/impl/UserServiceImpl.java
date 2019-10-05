package com.zx.service.impl;

import com.zx.mapper.UserMapper;
import com.zx.pojo.User;
import com.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper = null;

    @Override
    public User getUserById(long id) {
        User user = userMapper.getUser(7);
        System.out.println(user);
        return user;
    }
}
