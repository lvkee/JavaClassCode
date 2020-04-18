package cn.hnist.student;

public class StudentA extends PersonA {

    public StudentA() {
        super(18, "male");
        System.out.println("StudentA constructed");
    }

    @Override
    public void myPrint() {
        super.myPrint();
        System.out.println("Print completed!");
    }
}
