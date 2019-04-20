package ru.bidonov.task4;

import java.util.Arrays;

public class District {
    private int number;
    Patient [] patients = new Patient[10];

    public District (int number) {
        this.number = number;
    }

    public int getNumber () {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public Patient[] getPatients () {
        return patients;
    }

    public void setPatients (Patient[] patients) {
        this.patients = patients;
    }

    @Override
    public String toString () {
        return "District{" +
                "number=" + number +
                ", patients=" + Arrays.toString (patients) +
                '}';
    }
}
