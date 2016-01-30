package ua.artcode.university.week3.inher;

import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.common.Contact;
import ua.artcode.university.model.common.MyDate;
import ua.artcode.university.model.role.Dean;
import ua.artcode.university.model.role.Human;
import ua.artcode.university.model.role.Secretary;

/**
 * Created by serhii on 30.01.16.
 */
public class _01TestInheritance {

    public static void main(String[] args) {
        Dean dean = new Dean();
        Dean dean1 = new Dean(10000000, new Secretary("students money", 768_00));
        Dean dean2 = new Dean("Puzach",
                                50,
                                10000000,
                                new Secretary("students money", 768_00),
                                new Address("Ua", "city", "street", 23),
                                new Contact("2343242", "sdfsdf@dsfs,com"),
                                new MyDate(1960, 3, 23),
                                400000);

        dean2.work();

        // abstraction
        Human human = new Dean();

        // dean method
        dean.getBlackMoney();

        //parent method
        dean.getAge();


    }
}
