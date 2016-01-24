package ua.artcode.week2.day1;

public class Student {

    private static double monthMoney = 790;
    private static int idCounter = 0;
    private String idNum;
    private String name;
    private int rank;

    private MyDate birthday;
    private Address address;
    private Contact contact;

    public Student() {
    }

    // run before constructors
    {
        this.idNum = String.valueOf(idCounter);
        idCounter++;
    }

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public Student(String name, MyDate birthday,
                   Address address, Contact contact) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.contact = contact;
    }

    public static double getMonthMoney() {
        return monthMoney;
    }

    public static void staticMeth(){
        //rank++;
    }

    public void nonStaticMeth(){
        monthMoney++;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }


    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String asString(){
        return String.format("id %s, name %s, birthday %s, address %s",
                                idNum, name, birthday.asString(), address.asString());
    }

}
