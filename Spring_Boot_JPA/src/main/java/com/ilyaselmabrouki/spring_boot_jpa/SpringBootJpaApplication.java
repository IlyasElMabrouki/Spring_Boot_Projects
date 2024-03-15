package com.ilyaselmabrouki.spring_boot_jpa;

import com.ilyaselmabrouki.spring_boot_jpa.entities.Medecin;
import com.ilyaselmabrouki.spring_boot_jpa.entities.Patient;
import com.ilyaselmabrouki.spring_boot_jpa.repositories.MedecinRepository;
import com.ilyaselmabrouki.spring_boot_jpa.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository, MedecinRepository medecinRepository) {
        return args -> {
            //Add medecins
            Stream.of("Medecin1", "Medecin2", "Medecin3")
                    .forEach(name ->{
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setSpecialite("Cardio");
                        medecinRepository.save(medecin);
                    });

            //Add patients
            Stream.of("Patient1", "Patient2", "Patient3")
                    .forEach(name ->{
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                        patient.setScore(0);
                        patientRepository.save(patient);
                    });

            //Get patients
            List<Patient> patientsV1 = patientRepository.findAll();
            System.out.println("Liste des patients:");
            patientsV1.forEach(p -> System.out.println(p.toString()));

            //Search patients
            List<Patient> searchPatients = patientRepository.searchPatientByNom("Patient1");
            System.out.println("Liste des patients cherchés:");
            searchPatients.forEach(p -> System.out.println(p.toString()));

            //Update patients
            //updatePatient(new Patient(1L, "Patient4", new Date(), true, 20, null));
            patientRepository.save(new Patient(1L, "Patient4", new Date(), true, 20, null));

            //Delete patients
            patientRepository.delete(patientRepository.findById(3L).get());

            //Get new version of patients
            List<Patient> patientsV2 = patientRepository.findAll();
            System.out.println("Liste des patients:");
            patientsV2.forEach(p -> System.out.println(p.toString()));
        };
    }
}
