package Object_modeling;

import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    private String deptName;

    public DepartmentU(String deptName) {
        this.deptName = deptName;
    }

    public void display() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    private String uniName;
    private ArrayList<DepartmentU> departments = new ArrayList<>();
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String uniName) {
        this.uniName = uniName;
    }

    public void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showUniversity() {
        System.out.println("University: " + uniName);

        System.out.println("Departments:");
        for (DepartmentU d : departments) {
            d.display();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("Tech University");

        DepartmentU d1 = new DepartmentU("Computer Science");
        DepartmentU d2 = new DepartmentU("Mechanical");

        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Prof. Bob");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();
    }
}
