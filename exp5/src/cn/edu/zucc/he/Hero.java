package cn.edu.zucc.he;
//: exp4:Hero.java
import java.util.Random;
public class Hero {
    public String name;
    public int hp;
    public int level;
    Hero() {
        name = "无名英雄";
        hp = 100;
        level = 1;
        System.out.println(
                "\n角色为 ： " +
                name +
                "\n生命值 ： " +
                hp +
                "\n当前等级为 ： " +
                level);
    }
    Hero(String name, int type) {
        if (type == 1) {
            this.name = name;
            hp = 100;
        }
        if (type == 2) {
            this.name = name;
            hp = 200;
        }
        if (type == 3) {
            this.name = name;
            hp = 300;
        }
        System.out.println(
                "\n角色为 ： " +
                        name +
                        "\n生命值 ： " +
                        hp);
    }

    public void Fight(int isWho) {
        hp -= 10;
        if (isWho == 1)
            hp -= 3;
        if (isWho == 2)
            hp -= 6;
        if (isWho == 3)
            hp -= 10;
    }
}

/**
 * 回合制战斗
 */
class Test {
    public static void main(String[] args){
        Random rand = new Random();
        Random round = new Random();
        int isWho = 0;
        int r = 0;
        System.out.println("玩家一信息：");
        //Hero p1 = new Hero();
        isWho = Math.abs(rand.nextInt(3)) + 1;
        Hero p1 = new Hero("小白", isWho);
        System.out.println("玩家二信息：");
        //Hero p2 = new Hero();
        isWho = Math.abs(rand.nextInt(3)) + 1;
        Hero p2 = new Hero("小黑", isWho);
        System.out.println("------开始战斗------");
        //System.out.println(isWho);
        r = Math.abs(round.nextInt(2));
         do {
            if (r%2 == 0) {
                isWho = Math.abs(rand.nextInt(3)) + 1;
                //System.out.println(isWho);
                p2.Fight(isWho);
                //System.out.println(r);
                System.out.println("    回合" + r + "   ");
                System.out.println("\n玩家一:" + p1.name
                        +"\n当前生命值为：" +
                        p1.hp);
                System.out.println("\n玩家二:" + p2.name
                 +"\n当前生命值为：" +
                        p2.hp);
                System.out.println("-----------------");
            }else {
                isWho = Math.abs(rand.nextInt(3)) + 1;
                //System.out.println(isWho);
                p1.Fight(isWho);
                //System.out.println(r);
                System.out.println("    回合" + r + "   ");
                System.out.println("\n玩家一:" + p1.name
                        +"\n当前生命值为：" +
                        p1.hp);
                System.out.println("\n玩家二:" + p2.name
                        +"\n当前生命值为：" +
                        p2.hp);
                System.out.println("-----------------");
            }
            r++;
        }while(p1.hp > 0 && p2.hp > 0);
         if (r%2 == 0)
             System.out.println("玩家二胜利！");
         else
             System.out.println("玩家一胜利！");
    }
}