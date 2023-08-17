package com.oops;

public class classAndObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.roll);
        Student student2 = new Student(15, "Sapna", 77.7f);
        System.out.println(student2.marks);

        Student vikash = new Student(student1);
        System.out.println(vikash.name);
        System.out.println(student1.name);
    }

}

class Student{
    int roll;
    String name;
    float marks;

    Student(Student other){
        this.name = other.name;
    }

    Student() {
        this.roll = 34;
        this.name = "Vikash";
        this.marks = 97.1f;
    }

    Student(int roll, String name, float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
