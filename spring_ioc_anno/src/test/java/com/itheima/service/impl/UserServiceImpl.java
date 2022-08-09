package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


//<bean id="userService" class="com.itheima.service.impl.UserServiceImpl">
//@Component("userService")  //使用在类上用于实例化Bean
//Controller   //使用在web层类上用于实例化Bean
@Service("userService")  //使用service层类上用于实例化Bean
//@Scope("prototype")
//@Scope("singleton")   //标注Bean的作用范围
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")  //注入普通属性
    private String driver;

    //<property name="userDao" ref="userDao"></property>
    //@Autowired //按照数据类型从Spring容器中进行匹配的//使用在字段用于根据类型依赖注入
    //@Qualifier("userDao")  //是按照id值从容器中进行匹配的，但是主要此处@Qualifier结合@Autowired一起使用
    @Resource(name = "userDao") //@Resource相当于@Qualifier+@Autowired ，按照名称进行注入
    private UserDao userDao;
    //使用xml配置需要setter方法 使用注解可以省略不写
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        System.out.println(driver);
        userDao.save();

    }
    @PostConstruct   //使用在方法标注该方法是Bean的初始方法
    public void init(){
        System.out.println("Service对象的初始方法");
    }
    @PreDestroy   //使用在方法上标该方法是Bean的销毁方法
    public void destory(){
        System.out.println("Service对象的销毁方法");
    }
}
