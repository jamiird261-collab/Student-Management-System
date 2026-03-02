package Jamiir;

import java.util.ArrayList;
import java.util.List;

    public static void main(String[] args) {

        Student s1 = new Student(1, "Jordan", "Smith",
                "jsmith@email.com", 2, 3.8);

        Student s2 = new Student(2, "Marcus", "Brown",
                "mbrown@email.com", 1, 2.9);

        Instructor instructor = new Instructor(3, "Dr.", "Rivera",
                "rivera@email.com", "Computer Science");

        instructor.addStudent(s1);
        instructor.addStudent(s2);

        // Polymorphism — no instanceof needed
        List<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(instructor);

        for (Person p : people) {
            System.out.println(p.getSummary());
        }

        System.out.println();
        instructor.printRoster();
    }
}