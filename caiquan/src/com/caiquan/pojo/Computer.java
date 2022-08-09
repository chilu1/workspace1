package com.caiquan.pojo;

import java.util.Random;

public class Computer {

        String name = "小智";
        int score = 0;

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
        //出拳
        public int chuQuan(){
            Random r = new Random();
            int choice = r.nextInt(3)+1; //0 1 2
            if(choice ==1){
                System.out.println("小智出的是剪刀！");
            }else if (choice ==2){
                System.out.println("小智出的是石头！");
            }else if (choice ==3){
                System.out.println("小智出的是布！");
            }else {
                System.out.println("小智出拳错误！");
                choice = 0;
            }
            return choice;
        }
}
