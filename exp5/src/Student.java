//: exp5:Student.java
// Data members: student number, age, score,
// and number of static data member students count;
// Define the member function to set and read and display the student number,
// age, score, cumulative number of students;
// The static member function getCount () is used to return the total number of people.
// The external function average () is used to find the average.

import java.util.Scanner;
import javax.swing.*;
public class Student {
    private String number;
    private int age;
    private int score;
    static int count = 0;

    Student() {
        count++;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getCount() {
        return count;
    }
    public void myPrint() {
        System.out.println(
                "第" + count + "位同学的信息：" +
                "\n学号 = " + number +
                "\n年龄 = " + age +
                "\n成绩 = " + score);
    }
}
class Test {
    public static void main(String[] args) {
        int s;
        int sum = 0;
        int count = 0;
        for(int i = 1;i <= 10; i++) {
            Student si = new Student();
            si.setNumber("14194801786");
            si.setAge(18);
            System.out.println("请输入第" + i + "位同学的成绩：");
            Scanner input = new Scanner(System.in);
            s = input.nextInt();
            si.setScore(s);
            sum += s;
            count = si.getCount();
            si.myPrint();
        }
        //System.out.println(count);
        System.out.println("成绩录入完毕！");
        average(sum, count);
    }
    public static void average(int sum,int count){
        System.out.println("平均分为：" +
                sum/count);
    }
}