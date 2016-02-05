package ua.artcode.university.model.role;

/**
 * Created by serhii on 30.01.16.
 */
public class Teacher extends Worker {

    public void teach(){
        System.out.println("teacher work");
    }

    public void work(){
        teach();
    }

    public void makeReport(){
        System.out.println("teacher report");
    }

}
