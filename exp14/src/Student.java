/**
 * （1）编写一个java，在程序中定义一个Student类(学号，姓名，性别，年龄，籍贯)，并且完善Student的setter，getter方法。在测试代码中创建两个实例，并访问它们的属性和方法。
 * （2）给Student增加一个构造方法，该方法可以接受参数并对Student类中的各个属性进行赋值。学会this的使用。
 *
 * （3）修改age的属性为私有属性。
 * （4）设计方法：study，sleep方法。
 */
public class Student {
    private String studentNum;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private String studentHome;

    Student(){}

    Student(String studentNum, String studentName, String studentSex, int studentAge, String studentHome) {
        this.studentNum = studentNum;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentAge = studentAge;
        this.studentHome = studentHome;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentHome(String studentHome) {
        this.studentHome = studentHome;
    }

    public String getStudentHome() {
        return studentHome;
    }

    public void sleep() {
        System.out.println("Student sleeps!");
    }

    public void study() {
        System.out.println("Student studies!");
    }
}
