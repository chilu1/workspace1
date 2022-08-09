package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")  //使用dao层类上用于实例化Bean
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("save running...");
    }

}
