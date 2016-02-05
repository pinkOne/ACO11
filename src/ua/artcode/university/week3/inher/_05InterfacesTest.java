package ua.artcode.university.week3.inher;

import ua.artcode.university.model.role.Student;
import ua.artcode.world.place.Gym;
import ua.artcode.world.place.PaintballPlace;
import ua.artcode.world.place.Pub;

/**
 * Created by serhii on 30.01.16.
 */
public class _05InterfacesTest {

    public static void main(String[] args) {
        Student student = new Student();

        Gym.doTraining(student);

        PaintballPlace.play(student);

        Pub.haveFun(student);
    }


}
