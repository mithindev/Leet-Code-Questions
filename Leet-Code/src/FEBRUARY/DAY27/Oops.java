package FEBRUARY.DAY27;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Oops {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);


        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object

    // we need one word to access every object

    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Now to call a constructor from another constructor

    Student() {
        this (13, "Default Person", 100.0f);
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }
}
