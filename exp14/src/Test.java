public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentNum("14194801786");
        s1.setStudentName("Chris");
        s1.setStudentAge(18);
        s1.setStudentSex("Male");
        s1.setStudentHome("HeBei");
        Student s2 = new Student("123", "Pony", "Male", 19, "USA");
        print(s1);
        System.out.println("--------");
        print(s2);
        System.out.println("--------");
        s1.sleep();
        s2.study();
    }

    static void print(Student s) {
        System.out.print(s.getStudentName() + "的学号为 " + s.getStudentNum() + "\n" +
                s.getStudentName() + "的年龄为 " + s.getStudentAge() + "\n" +
                s.getStudentName() + "的性别为 " + s.getStudentSex() + "\n" +
                s.getStudentName() + "的籍贯为 " + s.getStudentHome() + "\n");
    }
}
