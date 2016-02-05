package ua.artcode.week3.finalW;

/**
 * Created by serhii on 31.01.16.
 */
public class TestIPhone {


    public static void main(String[] args) {
        IPhone iPhone = new IPhone("342", "34534534", new Ram(16), new Screen(5,5));
        iPhone.getRam().setSize(234);
    }
}
