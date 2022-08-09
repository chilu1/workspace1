package com.unit8.pojo;

import java.io.StringReader;

public class Dog {
    //定义类的属性
    String nick;
    String color;
    int age;

    //定义构造方法
    public Dog(String nick,String color,int age){
        //this();//手动调用默认的无参构造方法
        System.out.println("三个参数构造方法被调用了");
        //构造方法的作用是为了对象的属性值
        this.nick = nick;
        this.color = color;
        this.age = age;
    }

    public Dog(String a){
        this.color = a;
        System.out.println("一个参数构造方法被调用了");

    }

    public Dog() {
        System.out.println("无参构造方法被调用了");
    }

    //定义类的方法
    public void eat(){
        System.out.println("狗在吃骨头");
    }
    public void run(){
        System.out.println("狗在飞快的跑");
    }
    public void getSelf(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        Dog dog4 = new Dog("黄色");
        Dog dog3 = new Dog();
        Dog dog2 = new Dog("小白","白色",8);


        /*Dog dog2 = new Dog("小白","白色",8);
        System.out.println(dog2);
        dog2.getSelf();
        System.out.println(dog2.nick);
        System.out.println(dog2.color);
        System.out.println(dog2.age);
        dog2.eat();
        dog2.run();*/


        /*//创建一个对象：对象实例化
        Dog dog = new Dog();

        //给对象的属性赋值
        dog.nick = "小白";
        dog.color = "白色";
        dog.age = 8;

        //获取对象值
        System.out.println(dog.nick);
        System.out.println(dog.color);
        System.out.println(dog.age);
        //调用方法 对象名.方法名（）
        dog.eat();
        dog.run();*/
    }
}
