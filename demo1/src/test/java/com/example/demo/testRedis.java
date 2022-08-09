package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class testRedis {

    @Autowired(required = false)
    private RedisTemplate<String, String> redisTemplate;

    @Test
    void getName(){
        redisTemplate.opsForValue().set("name","dadadingdada!");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }
    /*@Test
    void setObject(){
        User user = new User();
        user.setName("dingdada");
        user.setAge(23);
        user.setHigh(172);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }*/
}
