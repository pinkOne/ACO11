package ua.artcode.university.model.additional.sort;

import ua.artcode.university.model.role.Student;

import java.util.Comparator;

/**
 * Created by serhii on 31.01.16.
 */
public class HumanBirthDayComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getBirthday().getYear() < o2.getBirthday().getYear()){
            return -1;
        } else if (o1.getBirthday().getYear() > o2.getBirthday().getYear()){
            return 1;
        } else {
            return 0;
        }

        // return
    }
}
