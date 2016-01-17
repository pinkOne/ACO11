package ua.artcode.week1.home;

/**
 * Created by serhii on 17.01.16.
 */
public class MyNumber {// Calculator

    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public MyNumber add(MyNumber other){
        return new MyNumber(this.value + other.value);
    }

    public int getValue() {
        return value;
    }
}
