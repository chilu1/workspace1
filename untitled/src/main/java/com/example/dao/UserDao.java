package com.example.dao;

import com.example.entity.User;

/**
 * 用户模块数据库访问的接口
 */
public interface UserDao {
    public User selectUserByUname(String username);
}
