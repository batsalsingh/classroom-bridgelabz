package Object_modeling;

import java.util.ArrayList;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class CourseU {
    private String courseName;
    private Professor professor;
    private ArrayList<StudentU> students = new ArrayList<>();

    public CourseU(String courseName) {
        this.courseName = courseName;
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.getName() + " assigned to " + courseName);
    }

    public void enroll(StudentU s) {
        students.add(s);
        System.out.println(s.getName() + " enrolled in " + courseName);
    }
}

class StudentU {
    private String name;

    public StudentU(String name) {
        this.name = name;
    }

    public void enrollCourse(CourseU c) {
        c.enroll(this);
    }

    public String getName() {
        return name;
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Alice");
        Professor p2 = new Professor("Prof. Bob");

        CourseU c1 = new CourseU("Java Programming");
        CourseU c2 = new CourseU("Data Structures");

        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        StudentU s1 = new StudentU("Charlie");
        StudentU s2 = new StudentU("David");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);
    }
}
