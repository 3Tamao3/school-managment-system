package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 500);
        Teacher blabla = new Teacher(3, "Blabla", 600);
        Teacher megan = new Teacher(6, "Megan", 2000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(blabla);
        teacherList.add(megan);

        Student test1 = new Student(1, "Test1", 2);
        Student test2 = new Student(2,"Test2", 3);
        Student test3= new Student(3, "Test3", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(test1);
        studentList.add(test2);
        studentList.add(test3);

        School ahs = new School (teacherList, studentList);

        test1.payFees(5000);
        test2.payFees(2020);
        test3.payFees(1234);

        System.out.println("---------AHS EARNINGS---------");

        System.out.println("AHS has earned: " + ahs.getTotalMoneyEarned());

        System.out.println("------------------------------");

        System.out.println("\n---------Making AHS PAY SALARY---------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("AHS has paid for salary to " + lizzy.getName() + " and now has " + ahs.getTotalMoneyEarned());

        melissa.receiveSalary(melissa.getSalary());
        System.out.println("AHS has paid for salary to " + melissa.getName() + " and now has " + ahs.getTotalMoneyEarned());

        blabla.receiveSalary(blabla.getSalary());
        System.out.println("AHS has paid for salary to " + blabla.getName() + " and now has " + ahs.getTotalMoneyEarned());

        megan.receiveSalary(megan.getSalary());
        System.out.println("AHS has paid for salary to " + megan.getName() + " and now has " + ahs.getTotalMoneyEarned());


        System.out.println(megan);
        System.out.println(lizzy);
        System.out.println(test1);
        System.out.println("------------------------------");
    }
}
