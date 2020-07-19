package com.springboot.service.impl;

import com.springboot.bean.User;
import com.springboot.dao.UserDao;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void save(User user) {
        userDao.save(user);
    }
    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }


}
