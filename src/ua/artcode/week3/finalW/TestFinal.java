package ua.artcode.week3.finalW;

/**
 * Created by serhii on 31.01.16.
 */
public class TestFinal {

    public static void main(String[] args) {
        final Key key = new Key("1234",4);
        System.out.println(openDoor(key));


        //side effect
        shareKey(key);

        // 100 lines of code



        System.out.println(openDoor(key));
    }

    private static void shareKey(Key key) {
        //key.setValue("45656");
    }


    public static boolean openDoor(Key key){
        return key.getValue().equals("1234");
    }

}

class Key {

    private final String value;
    private final int count;

    public Key(String value, int count) {
        this.value = value;
        this.count = count;
    }

    public String getValue() {
        return value;
    }

}
