package Object_modeling;

import java.util.ArrayList;

class Doctor {
    private String name;
    private ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println("Doctor " + name + " consulted patient " + p.getName());
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor d) {
        if (!doctors.contains(d)) {
            doctors.add(d);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Hospital {
    private String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void showInfo() {
        System.out.println("Hospital: " + hospitalName);
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Smith");
        Doctor d2 = new Doctor("Dr. Brown");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        h.showInfo();

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        p1.showDoctors();
        p2.showDoctors();
    }
}
