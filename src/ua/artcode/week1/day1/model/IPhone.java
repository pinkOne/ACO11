package ua.artcode.week1.day1.model;

/**
 * Created by serhii on 17.01.16.
 */
public class IPhone {

    private int ram = 1;
    private int rom = 8;
    private String version;

    public IPhone(String version){
        this.version = version;
    }

    public IPhone(int ram, int rom, String version){
        this.ram = ram;
        this.rom = rom;
        this.version = version;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getVersion() {
        return version;
    }
}
