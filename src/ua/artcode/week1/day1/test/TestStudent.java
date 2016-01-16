package ua.artcode.week1.day1.test;

import ua.artcode.week1.day1.model.Student;

/**
 * Created by serhii on 16.01.16.
 */
public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.initStudent("Kolia",25,"3093093093");

        s1.printInfo();


        Student s2 = new Student();
        s2.name = "Vania";
        s2.age = 25;
        s2.phone = "+38093 2323233";

        s2.printInfo();

        
        // String + String , String + primitive = String
    }
}
