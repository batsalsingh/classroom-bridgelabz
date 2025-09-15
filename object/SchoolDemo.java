package Object_modeling;

import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + courseName + " -> Students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c2);

        school.showStudents();
        s1.showCourses();
        c2.showStudents();
    }
}
