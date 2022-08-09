package com.caiquan.pojo;

public class Game {

    //将对象作为了Game类的一个属性
    String name = "XXX";
    Person person = new Person();
    Computer computer = new Computer();
    int count = 0;

     //1.剪刀 2.石头 3.布
    public void startGame(){
        System.out.println("游戏开始");
        System.out.println(person.name+"-----VS-----"+computer.name);
        for(int i=1;i<=5;i++){
            this.count = i;
            System.out.println("当前是第"+this.count+"轮");
              int pchoice = this.person.chuQuan();
              int cchoice = this.computer.chuQuan();
              if ((pchoice ==1 && cchoice ==2)||(pchoice ==2 && cchoice ==3)||(pchoice ==3 && cchoice ==1)){
                  System.out.println("这局小智赢了！");
                  this.computer.score = this.computer.score+1;
              }else if ((pchoice ==1 && cchoice ==3)||(pchoice ==2 && cchoice ==1)||(pchoice ==3 && cchoice ==2)){
                  System.out.println("这局玩家赢了");
                  this.person.score = this.person.score+1;
              }else if ((pchoice ==1 && cchoice ==1)||(pchoice ==2 && cchoice ==2)||(pchoice ==3 && cchoice ==3)){
                  System.out.println("出拳相同！都不加分！");
              } else if (pchoice ==0){
                  this.computer.score = this.computer.score+1;
              }else  if (cchoice ==0){
                  this.person.score = this.person.score+1;
              }
            System.out.println("当前分数：玩家"+this.person.score+"电脑"+this.computer.score);
        }
        getResult();
    }
    public void getResult(){
        System.out.println("===最终分数：玩家"+this.person.score+"电脑"+this.computer.score+"===");
        if(this.person.score>this.computer.score){
            System.out.println("恭喜你！！！玩家获胜");
        }else if (this.person.score<this.computer.score){
            System.out.println("很遗憾！！！电脑获胜");
        }
        System.out.println("Game Over..........");
    }

}
