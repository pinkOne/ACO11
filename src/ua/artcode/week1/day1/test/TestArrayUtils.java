package ua.artcode.week1.day1.test;

import ua.artcode.utils.ArrayUtils;

import static ua.artcode.utils.ArrayUtils.*;

/**
 * Created by serhii on 17.01.16.
 */
public class TestArrayUtils {


    public static void main(String[] args) {

        /*if (true) {
            System.out.println("");
        } else {
            System.out.println();
            System.out.println();
        }*/

        int[] mas1 = {2, 6, 4, 1, 7, -5, 9, -1, 1, 10};
        int[] mas2 = {2, 6, 4, 1, 7, -5, 9, -1, 1, 10};

        System.out.print("mas1 ");
        print(mas1);

        // positive
        int indexOfRes = indexOf(mas1, 1);
        System.out.println((indexOfRes == 3) + " indexOf(mas1, 1) = " + indexOfRes);
        // negative
        System.out.println("indexOf(null, 1) = " + indexOf(null, 1));

        int minRes = min(mas1);
        System.out.println((minRes == -5) + " min(mas1)" + minRes);

        System.out.println("lastIndexOf(mas1, 1) " + lastIndexOf(mas1, 1));

        System.out.print("revert(mas1) ");
        print(revert(mas1));

        System.out.print("sym(mas1, mas2) ");
        print(sym(mas1, mas2));

        System.out.print("subarray(mas1, 2, 6)");
        print(subarray(mas1, 2, 6));


    }

}
