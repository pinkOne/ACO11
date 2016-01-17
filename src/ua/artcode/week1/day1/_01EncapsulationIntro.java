package ua.artcode.week1.day1;

import ua.artcode.week1.day1.model.IPhone;
import ua.artcode.week1.day1.model.VkSystem;

/**
 * Created by serhii on 17.01.16.
 */
public class _01EncapsulationIntro {

    public static void main(String[] args) {
        VkSystem vkSystem = new VkSystem();

        IPhone iPhone = new IPhone(4,32,"6s");

        IPhone iPhone1 = new IPhone("5s");

        // 0
        iPhone1.getRom();


    }
}
