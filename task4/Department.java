package ru.bidonov.task4;

import ru.bidonov.task4.administration.Doctor;

import java.util.Arrays;

public class Department {
    private String title;
    private Doctor [] doctors = new Doctor[8];

    public Department (String title) {
        this.title = title;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public Doctor[] getDoctors () {
        return doctors;
    }

    public void setDoctors (Doctor[] doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString () {
        return "Department{" +
                "title='" + title + '\'' +
                ", doctors=" + Arrays.toString (doctors) +
                '}';
    }
}
