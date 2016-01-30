package ua.artcode.university.model.role;

import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.common.Contact;
import ua.artcode.university.model.common.MyDate;

/**
 * Created by serhii on 30.01.16.
 */
public class Dean extends Worker {

    private long blackMoney;
    private Secretary secretary;

    public Dean() {

    }

    public Dean(long blackMoney, Secretary secretary) {
        this.blackMoney = blackMoney;
        this.secretary = secretary;
    }

    public Dean(String name, int age, long blackMoney, Secretary secretary, Address address, Contact contact, MyDate birthDay, int salary) {
        super(name, age,birthDay,address,contact, salary);
        this.blackMoney = blackMoney;
        this.secretary = secretary;
    }

    public long getBlackMoney() {
        return blackMoney;
    }

    public void setBlackMoney(long blackMoney) {
        this.blackMoney = blackMoney;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public String makeYearReport() {
        return "MyReport " + getName() + " :" + secretary.makeMoneyReport();
    }

    public void askSecretary(){
        System.out.println("Dean works");
    }

    public void work(){
        askSecretary();
    }

    @Override
    public void makeReport() {
        System.out.println("dean report");
    }

}
