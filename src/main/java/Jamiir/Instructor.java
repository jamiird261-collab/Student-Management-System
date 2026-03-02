package Jamiir;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person {

    private String department;
    private List<Student> students;

    public Instructor(int id, String firstName, String lastName, String email,
                      String department) {
        super(id, firstName, lastName, email);
        this.department = department;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printRoster() {
        System.out.println(getFullName() + "'s Roster:");
        for (Student s : students) {
            System.out.println("- " + s.getSummary());
        }
    }

    public void createAnnouncement(String message) {
        System.out.println("Announcement from " + getFullName() + ": " + message);
    }

    @Override
    public String getSummary() {
        return "[Instructor] " + getFullName() +
                " | Department: " + department;
    }
}