package com.gla.Method;

public class Student {
    String name;
    Double cpi;
    String course;
    static String college = "GLA University";

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prashant";
        s1.cpi = 8.5;
        s1.course = "B.Tech";

        System.out.println(s1.name);
        System.out.println(s1.cpi);
        System.out.println(s1.course);
        System.out.println(Student.college);

    }

}
