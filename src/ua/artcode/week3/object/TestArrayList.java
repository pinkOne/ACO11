package ua.artcode.week3.object;

import ua.artcode.university.model.role.Student;

import java.util.ArrayList;

/**
 * Created by serhii on 31.01.16.
 */
public class TestArrayList {

    public static void main(String[] args) {

        Object wrap = new Integer(322);

        // autoboxing,
        Integer i1 = 23;

        //unboxing
        int res = i1 + 78;// i1..intValue() + 78


        Object[] mas = {23,new Student(),"sdfs",23.3};

        int el1 = (int) mas[1]; // see Generics


        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //              mas                 AL(list)
        // insert       mas[0] = 23         list.add(23)
        // remove       mas[0] = null       list.remove(0)
        // get          int get = mas[0];   list.get(0)
        // length       mas.lenght          list.size();

        arrayList.add(12);
        arrayList.add(0,222);
        arrayList.add(23);
        arrayList.add(45);
        arrayList.add(56);

        arrayList.set(1, 5555);

        arrayList.ensureCapacity(70);

        int el2 = arrayList.get(1);

        //arrayList();


    }
}
