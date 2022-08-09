package com.itheima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//标志该类是Spring的核心配置类
@Configuration  //当创建容器时会从该类上加载注解

//作用在Spring的xml配置文件中的<context:component-scan base-package="com.itheima"/>一样
@ComponentScan("com.itheima")  //用于指定Spring在初始化容器时要扫的包

//<import resource=""/>
@Import(DataSourceConfiguration.class)  //用于导入其他配置类

public class SpringConfiguration {


}
