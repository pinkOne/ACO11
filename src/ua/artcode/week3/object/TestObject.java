package ua.artcode.week3.object;

import ua.artcode.university.model.role.Student;
import ua.artcode.week3.finalW.IPhone;
import ua.artcode.week3.finalW.Ram;
import ua.artcode.week3.finalW.Screen;

import java.util.ArrayList;

/**
 * Created by serhii on 31.01.16.
 */
public class TestObject {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone("342", "34534534", new Ram(16), new Screen(5,5));
        // Object equals, toString

        System.out.println(iPhone);

    }

}
