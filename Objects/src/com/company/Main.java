package com.company;

public class Main {

    public static void main(String[] args) {


        /*{  //3rd practice
            Student s1 = new Student();
            s1.name = "KAmran";
            s1.age = 23;
            s1.rolNo = 18;

            System.out.println("Phly s1 k Obj per name = " + s1.getName() + " age " + s1.getAge() + " rolNo " + s1.getRolNo());

            University university = new University("Fuuast");
            university.addStudent1(s1);
            university.getStudents();
            university.addStudent2("Sani", 15, 12);
            university.getStudents();
            university.addStudent3(s1);

            Student s2 = new Student();
            s2.name = "atudent ka 2nd obj ";
            Student s3 = new Student();
            s3.name = "Student ka 3rd obj ";
            Student s4 = new Student();
            s4.name = "student ka 4th obj ";

            university.addStudent3(s2);
            university.addStudent3(s3);
            university.addStudent3(s4);

            university.displayName();

            for (int i = 0; i < university.studentArray.length; i++) {
                if (university.studentArray[i] != null) {
                    System.out.println("doosra Tareeka " + university.studentArray[i].name);
                }
            }
            for (int i = 0; i < university.index; i++) {
                System.out.println("3sra tareeka " + university.studentArray[i].name);
            }

        System.out.println(university.getStudentArray().length);

        Student[] studentList = university.getStudentArray();

        for (int i = 0; i < university.getStudentArray().length; i++) {
            System.out.println("4thh tareeks " + studentList[i].getName());
        }
    }*/


















        /*{ //2nd ki practice
            Student s1 = new Student();
            s1.setName("Kamran");
            System.out.println(s1.displayName());
            System.out.println(s1.name);
            Student s2 = s1;
            System.out.println("s2 obj ki initilization k bad s1 " + s1.displayName());
            System.out.println("S2 new object k bad " + s2.name);
            s2.name = "Ali";
            System.out.println("s2 ka name initilize k bad " + s2.name);
            System.out.println("s2 k name initilize k bad s1 " + s1.displayName());
            s1.setName("Khan");
            System.out.println("s1 ka set name k bad S2 " + s1.displayName());
            System.out.println("s1 ka set name k bad S2 ka name or displayname " + s2.displayName() + " " + s2.name);
            Student s3 = s2;
            System.out.println("s3 k object ko S2 refer karny k bad s3 ka displayName  " + s3.displayName() + " or name " + s3.name);
            s3.setName("Sani");
            System.out.println("s3 ka setname k baad s1 ka displayname " + s1.displayName());
            System.out.println("s3 ka setname k baad s2 ka displayname " + s2.displayName());
            System.out.println("s3 ka setname k baad s3 ka displayname " + s3.displayName());
        }*/

        /*{ //1st practice
        Student student = new Student();
        student.name = "Kamran";
        student.course = "CS";
        student.displayName();

        System.out.println(student.name);

        student.displayCourse();

        Student s1 = new Student();

        s1.name = "ALI";
        System.out.println("s1 " + s1.name);
        Student s2 = s1;
        System.out.println("s2 before initilize " + s2.name);
        s2.name = "Khan";
        System.out.println("s2 after initilize" + s2.name);
        System.out.println("s1 ,s2 k initilize k baad  " + s1.name);
        s2.displayCourse();
    }*/

    }
}
