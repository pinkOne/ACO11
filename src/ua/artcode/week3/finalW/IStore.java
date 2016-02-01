package ua.artcode.week3.finalW;

/**
 * Created by serhii on 31.01.16.
 */
public class IStore {

    private IPhone iPhone = new IPhone("342", "34534534", new Ram(16), new Screen(5,5));

    public IPhone sellIPhone(){
        IPhone forSell = iPhone;
        iPhone = null;
        return forSell;
    }

    public void buyIphone(IPhone iPhone){
        this.iPhone = iPhone;
    }
}
