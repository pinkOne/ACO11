package ua.artcode.university.model;

import ua.artcode.university.model.additional.sort.HumanBirthDayComporator;
import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.role.Student;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by serhii on 23.01.16.
 */
public class Group {

    private String groupName;
    private ArrayList<Student> students = new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student greenStudent){
        students.add(greenStudent);
    }

    public Student deleteLastStudent(){
        return students.remove(students.size() - 1);
    }

    public Student findById(String id){
        if(id == null){
            System.err.println("id is null");
            return null;
        }

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getIdNum().equals(id)){
                return student;
            }
        }

        System.err.println("No student found");
        return null;
    }

    public Student[] filterByName(String name){
        ArrayList<Student> res = new ArrayList<>();

        int curr = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getName().equals(name)){
                res.add(student);
            }
        }

        return res.toArray(new Student[res.size()]);
    }

    public Student[] filterByCity(String city){
        ArrayList<Student> res = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            Address address = student.getAddress();
            if(address != null && address.getCity().equals(city)){
                res.add(student);
            }
        }

        return toArr(res);
    }

    public String asString(){
        String res = "GROUP NAME " + groupName +
                "\n"+ "Count " + students.size() + "\n";

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            res += student.toString() + "\n";
        }


        return res;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getSize(){
        return students.size();
    }

    public Student[] sortByName() {
        Student[] forSort = toArr(students);

        Arrays.sort(forSort);

        return forSort;
    }

    public Student[] sortByDate() {
        Student[] forSort = toArr(students);

        Arrays.sort(forSort, new HumanBirthDayComporator());

        return forSort;
    }

    private Student[] toArr(ArrayList<Student> al){
        return al.toArray(new Student[al.size()]);
    }

}
