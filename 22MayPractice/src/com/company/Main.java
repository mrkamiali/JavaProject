package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Student Class first obj
        Student s = new Student();
        //University Class first obj
        University university = new University();
        //iitialized student class Variable with respect to first Obj Ref
        s.name = "Kamran";
        s.age = 23;
        s.rollNo = 12;

//        System.out.println("Uni 1st Student "+university.s.name);
        university.displayStudent(s);
        university.displayStudent2("Kamran ALi", 23, 13);

        System.out.println(university.s.name);

        Student student = new Student();
        student.name = "Kamran";
        Student student1 = new Student();
        student1.name = "Moosa";
        Student student2 = new Student();
        student2.name = "Ali";

        university.StudentList(student);
        university.StudentList(student1);
        university.StudentList(student2);

        for (int i = 0; i < university.student.length; i++) {
            if (university.student[i] != null) {
                System.out.println(university.student[i].name);

            }
        }

    }
}
