package cn.hnist.student;

public class PersonA {
    private int age;
    private String sex;

    PersonA() {
    }

    PersonA(int age, String sex) {
        System.out.println("PersonA constructed");
        this.age = age;
        this.sex = sex;
        myPrint();
    }

    public void myPrint() {
        System.out.println("\nage : " + age
                + "\nsex : " + sex);
    }
}
