package ua.artcode.week3.finalW;

public class IPhone {

    private final String version;
    private final String id;
    private final Ram ram;
    private final Screen sceen;

    public IPhone(String version, String id, Ram ram, Screen sceen) {
        this.version = version;
        this.id = id;
        this.ram = ram;
        this.sceen = sceen;
    }

    public String getVersion() {
        return version;
    }

    public String getId() {
        return id;
    }

    public Ram getRam() {
        return ram;
    }

    public Screen getSceen() {
        return sceen;
    }

    public final void play(){
        System.out.println("I phone original, tra-tra, play");
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "version='" + version + '\'' +
                ", id='" + id + '\'' +
                ", ram=" + ram +
                ", sceen=" + sceen +
                '}';
    }
}
