package ua.artcode.university.week3.inher;

import ua.artcode.university.model.role.Teacher;
import ua.artcode.university.model.role.Worker;

/**
 * Created by serhii on 30.01.16.
 */
public class _03TestPolymorphism {


    public static void main(String[] args) {
        Worker worker = new Teacher();
        worker.work();
    }
}
