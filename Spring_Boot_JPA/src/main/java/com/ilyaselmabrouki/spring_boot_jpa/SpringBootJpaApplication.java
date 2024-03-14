package com.ilyaselmabrouki.spring_boot_jpa;

import com.ilyaselmabrouki.spring_boot_jpa.entities.Patient;
import com.ilyaselmabrouki.spring_boot_jpa.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringBootJpaApplication {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }

    public void updatePatient(Patient p){
        Patient patient = patientRepository.findById(p.getId()).get();
        patient.setId(p.getId());
        patient.setNom(p.getNom());
        patient.setDateNaissance(p.getDateNaissance());
        patient.setMalade(p.isMalade());
        patient.setScore(p.getScore());
        patientRepository.save(patient);
    }

    //@Override
    /*public void run(String... args) throws Exception {
        //Add patients
        patientRepository.save(new Patient(null, "Patient1", new Date(), false, 10, null));
        patientRepository.save(new Patient(null, "Patient2", new Date(), true, 20,null));
        patientRepository.save(new Patient(null, "Patient3", new Date(), false, 30, null));

        //Get patients
        List<Patient> patientsV1 = patientRepository.findAll();
        System.out.println("Liste des patients:");
        patientsV1.forEach(p -> {
            System.out.println(p.toString());
        });

        //Search patients
        List<Patient> searchPatients = patientRepository.searchPatientByNom("Patient1");
        System.out.println("Liste des patients cherchés:");
        searchPatients.forEach(p -> {
            System.out.println(p.toString());
        });

        //Update patients
        updatePatient(new Patient(1L, "Patient4", new Date(), true, 20, null));
        //patientRepository.save(new Patient(1L, "Patient4", new Date(), true, 20, null));

        //Delete patients
        patientRepository.delete(patientRepository.findById(3L).get());

        //Get new version of patients
        List<Patient> patientsV2 = patientRepository.findAll();
        System.out.println("Liste des patients:");
        patientsV2.forEach(p -> {
            System.out.println(p.toString());
        });
    }*/
}
