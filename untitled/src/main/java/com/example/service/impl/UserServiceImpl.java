package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoImpl;
import com.example.entity.User;
import com.example.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean checkUser(String name) {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.selectUserByUname(name);
        if (user != null){
            return true;
        }
        return false;
    }
}
