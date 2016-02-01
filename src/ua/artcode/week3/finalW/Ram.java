package ua.artcode.week3.finalW;


public class Ram {

    private int size;

    public Ram(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "size=" + size +
                '}';
    }
}
