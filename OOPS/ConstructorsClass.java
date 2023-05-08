package OOPS;

import javax.swing.text.MaskFormatter;

public class ConstructorsClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        //Student s2 = new Student("Rizwan Ahmad");
        //Student s3 = new Student("703");
        s1.name = "Rizwan Ahmad";
        s1.roll = 703;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "qwerty";
        s1.marks[2] = 100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    int marks[];
    String password;
    class Address{
        String city;
    }
    //Shallow Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    //Deep Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    //Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    
    Student() {
        marks = new int[3];
        System.out.println("This is Non-Parameterized Constructor");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
        System.out.println("My name is " + name);
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
        System.out.println("My RollNumber is " + roll);
    }

}