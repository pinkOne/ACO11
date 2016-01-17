package ua.artcode.week1.day1.model;

/**
 * Declare structure
 */
public class Student {

    private String name;
    private int age;
    private String phone;

    public Student(){
    }

    public Student(String name, int age, String phone){
        //Student me = this;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void printInfo(){
        System.out.println(name + " " + age + " " + phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    // non static method depends on instance(object)


}
