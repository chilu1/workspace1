package com.example.dao.impl;

import com.example.dao.UserDao;
import com.example.entity.User;

import com.example.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import java.sql.SQLException;

/**
 * 用户模块数据库访问的实现类
 */
public class UserDaoImpl implements UserDao {

    private QueryRunner queryRunner =new QueryRunner(C3p0Utils.getDataSource());
    @Override
    public User selectUserByUname(String username) {
        User user = null;
        String sql = "select u_id as uid,u_name as uname,u_password as upassword,u_email as uemail,u_sex as usex,u_status as status,u_code as ucode,u_role as urole from user where u_name = ?";
        try {
            user = queryRunner.query(sql,new BeanHandler<User>(User.class),username);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }

}
