package com.unit8.pojo;

public class Cat {
    //定义类的属性
    String nick;
    String color;
    int age;

    //静态属性
    //静态属性一般有初始值
    //可以使用类名、对象猫访问到
    //如果在同一个文件中，静态属性也可以访问
    static String type = "宠物";

    public Cat(String nick, String color, int age) {
        this.nick = nick;
        this.color = color;
        this.age = age;
    }

    public Cat( ) {

    }

    //静态方法可以被类名、对象名调用
    //如果在同一个文件中，静态方法也可以直接调用
    public static void eat(){
        System.out.println("猫在吃鱼！");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("小米","黄色",8);
        cat.eat();
        Cat.eat();
        eat();

        System.out.println(Cat.type);
        System.out.println(cat.type);
        System.out.println(type);


    }
}
