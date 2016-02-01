package ua.artcode.week3.object;

/**
 * Created by serhii on 31.01.16.
 */
public class TestStatic {
    public static void main(String[] args) {
        System.out.println(StatContainer.i);
    }
}

class StatContainer {

    static int i = 345;

    static {
        System.out.println("static block");
    }

}
