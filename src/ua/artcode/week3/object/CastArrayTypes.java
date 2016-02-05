package ua.artcode.week3.object;

import ua.artcode.university.model.role.Student;

/**
 * Created by serhii on 31.01.16.
 */
public class CastArrayTypes {

    public static void main(String[] args) {
        Object[] mas = new Student[10];
        Object[] mas1 = new Object[10];

        Student[] st = (Student[]) mas;
        //Student[] st1 = (Student[]) mas1;
    }
}
