package ru.bidonov.task4;

import ru.bidonov.task4.administration.Doctor;

public class HospitalApplication {
    public static void main (String[] args) {

        Patient mihail = new Patient ("Михаил", "Петров");
        Patient svetlana = new Patient ("Светлана" , "Афанасьева");
        Patient andrey = new Patient ("Андрей", "Васильев");


        mihail.setAdress ("ул. Космонавтов, 8-12");
        mihail.setDiagnosis ("ОРВИ");
        svetlana.setDiagnosis ("Простуда");
        svetlana.setAdress ("ул. Попова, 5-49");


        Doctor sidorov = new Doctor ("Петр", "Сидоров");
        sidorov.setSalary (25000);
        Doctor volkov = new Doctor ("Андрей", "Волков");
        volkov.setCategory ("Доктор наук");

        Department surgery = new Department ("Хирургия");
        surgery.setDoctors (new Doctor[]{sidorov, volkov});

        District district1 = new District (1);
        district1.setPatients (new Patient[]{mihail, svetlana});

        System.out.println (sidorov);
        System.out.println (andrey);
        System.out.println (surgery);
        System.out.println (district1);







    }
}
