package ua.artcode.week2.day1;

/**
 * Created by serhii on 23.01.16.
 */
public class Group {

    private int freePlace = 0;
    private String groupName;
    private Student[] students = new Student[24];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student greenStudent){
        students[freePlace] = greenStudent;
        freePlace++;
    }

    public Student deleteLastStudent(){
        freePlace--;
        students[freePlace] = null;
        return null;
    }

    public Student findById(String id){
        return null;
    }

    public Student[] filterByName(String name){
        return null;
    }

    public Student[] filterByCity(String city){
        return null;
    }

    public String allStudents(){
        return null;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getSize(){
        return freePlace;
    }
}
