//: exp6:Rand.java
// Input a four-digit number from the KB
// Randomly generate a number
// If the hundred digit of the four-digit number
// is that number, then bingo

import java.util.Random;
import java.util.Scanner;
public class Rand {
    public static void main(String[] args) {
        System.out.println("请输入您的会员号：");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (hundred(i) == rand()) {
            System.out.println("恭喜您，中奖了！");
        }else {
            System.out.println("很遗憾，未中奖！");
        }
    }

    public static int hundred(int i) {
        int j = i/100;
        j = j%10;
        System.out.println("您的百位数字是： " + j);
        return j; // 返回百位数
    }

    public static int rand() {
        //Random rand = new Random();
        //int r = Math.abs(rand.nextInt(10));
        java.util.Random random = new java.util.Random();
        int r = random.nextInt(10);
        System.out.println("随机产生的数字是 : " + r);
        return r; //返回一个随机产生的0-9的数字
    }
}
