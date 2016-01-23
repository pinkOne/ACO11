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

    public void deleteLastStudent(){
        freePlace--;
        students[freePlace] = null;
    }

    public String allStudents(){
        return null;
    }

    public String getGroupName() {
        return groupName;
    }
}
