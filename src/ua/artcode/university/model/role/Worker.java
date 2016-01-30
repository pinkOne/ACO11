package ua.artcode.university.model.role;

import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.common.Contact;
import ua.artcode.university.model.common.MyDate;

/**
 * Abstract class = Abst(abstract methods) + Implem(non-abstract)
 */
public abstract class Worker extends Human {

    public static final int WORK_DAY_HOURS = 8;
    private double salary;
    private int amountHours;

    public Worker() {
    }

    public Worker(String name, int age, MyDate birthday,
                  Address address, Contact contact, double salary) {
        super(name, age, birthday, address, contact);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(int amountHours) {
        this.amountHours = amountHours;
    }

    public void work(){
        amountHours += WORK_DAY_HOURS;
        System.out.println("Hard work");
    }

    public abstract void makeReport();


}
