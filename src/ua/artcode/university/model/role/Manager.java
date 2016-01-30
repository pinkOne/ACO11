package ua.artcode.university.model.role;

import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.common.Contact;
import ua.artcode.university.model.common.MyDate;

/**
 * Created by serhii on 30.01.16.
 */
public class Manager extends Worker {

    private Worker[] places;
    private int size;

    public Manager(String name, int age, MyDate birthday,
                   Address address, Contact contact, double salary) {
        super(name, age, birthday, address, contact, salary);
        places = new Worker[10];
    }

    @Override
    public void makeReport() {
        System.out.println("man report");
    }

    public void addWorker(Worker worker){
        places[size++] = worker;
    }

    public void doTeamWork(){
        for (int i = 0; i < size; i++) {
            places[i].work();
        }
    }

}
