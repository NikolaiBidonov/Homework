package ru.bidonov.task4;

import java.time.LocalDate;

public class Patient extends Person {
    private String adress;
    private String diagnosis;


    public Patient (String name, String surname) {
        super (name, surname);
    }


    public String getAdress () {
        return adress;
    }

    public void setAdress (String adress) {
        this.adress = adress;
    }

    public String getDiagnosis () {
        return diagnosis;
    }

    public void setDiagnosis (String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString () {
        return "Patient{" +
                "adress='" + adress + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}




