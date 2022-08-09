package com.unit8.test;

public class Test2 {

    /*
     * public：在当前项目中，所有地方都可以访问到这个方法
     * static：静态方法，可以使用类名调用，在文件内部也可以直接调用
     * main：固定的方法名
     * String[] args：接收一个字符串数组类型参数
     *
     * */

    public static void main(String[] args) {

        System.out.println("main方法被执行了！");
        for (String s:args){
            System.out.println("------------------"+s);
        }
    }
}
