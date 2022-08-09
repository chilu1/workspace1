package com.unit8.pojo;

public class AddSum {

    public int add(int a,int b){
        int s = a+b;
        return s;
    }
    public int add(int a,int b,int c){
        int s = a+b+c;
        return s;
    }
    public int add(int a,int b,int c,int d){
        int s = a+b+c+d;
        return s;
    }
    public int add(int a,int b,int c,int d,int e){
        int s = a+b+c+d+e;
        return s;
    }


    public static void main(String[] args) {
        AddSum as = new AddSum();

        int s = as.add(10, 10,10,10,10);
        System.out.println(s);
    }
}
