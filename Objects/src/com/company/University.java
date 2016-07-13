package com.company;

/**
 * Created by Kamran ALi on 6/28/2016.
 */
public class University {
    String name;
    Student s;
    Student[] studentArray = new Student[5];
    int index = 0;

    public University(String name) {
        this.name = name;
    }

    public void addStudent() {
        s = new Student();
    }

    public void addStudent1(Student s) {
        this.s = s;
    }

    public void addStudent2(String name, int age, int rolNo) {
        s = new Student();
        s.name = name;
        s.age = age;
        s.rolNo = rolNo;

    }

    public void addStudent3(Student s) {
        studentArray[index++] = s;
    }

    public void displayName() {
        for (int i = 0; i < index; i++) {

            System.out.println(this.studentArray[i].name);
        }
    }

    public void getStudents() {
        System.out.println("University ki class ma se " + s.getName() + " " + s.getRolNo() + " " + s.getAge());
    }

    public Student[] getStudentArray(){
        return studentArray;

    }
}
