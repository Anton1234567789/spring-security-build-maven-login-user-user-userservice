package com.s3k3l3v.ssbmluuu.service;

import com.s3k3l3v.ssbmluuu.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("1111");
        return user;
    }
}
