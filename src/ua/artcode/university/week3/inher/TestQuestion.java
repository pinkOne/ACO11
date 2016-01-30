package ua.artcode.university.week3.inher;

/**
 * Created by serhii on 30.01.16.
 */
public class TestQuestion {
    public static void main(String[] args) {
        Test test = new Test(10);
    }
}

class Test {
    private String[] arrayOfStrings;
    private int arrayLength;

    {
        arrayOfStrings = new String[arrayLength];
    }

    Test(int methodVariable){
        arrayLength = methodVariable;
    }
}
