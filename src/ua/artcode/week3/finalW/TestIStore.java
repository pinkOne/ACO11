package ua.artcode.week3.finalW;

/**
 * Created by serhii on 31.01.16.
 */
public class TestIStore {

    public static void main(String[] args) {
        IStore store = new IStore();

        store.sellIPhone();

        store.buyIphone(new Xiomi("344", "23423", new Ram(23), new Screen(4, 4)));
        
        IPhone iPhone = store.sellIPhone();
        iPhone.play();

    }
}
