package com.ilyaselmabrouki.spring_boot_jpa;

import com.ilyaselmabrouki.spring_boot_jpa.entities.*;
import com.ilyaselmabrouki.spring_boot_jpa.service.IHospitalService;
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
    CommandLineRunner start(IHospitalService hospitalService) {
        return args -> {

            //Add medecins
            Stream.of("Medecin1", "Medecin2", "Medecin3")
                    .forEach(name ->{
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name.toLowerCase() + "@gmail.com");
                        medecin.setSpecialite("Cardio");
                        hospitalService.saveMedecin(medecin);
                    });

            //Add patients
            Stream.of("Patient1", "Patient2", "Patient3")
                    .forEach(name ->{
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                        patient.setScore(0);
                        hospitalService.savePatient(patient);
                    });

            //Add Rendez-Vous
            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.CONFIRMED);
            Patient patient = hospitalService.searchPatient("Patient1");
            Medecin medecin = hospitalService.searchMedecin("Medecin1");
            rendezVous.setPatient(patient);
            rendezVous.setMedecin(medecin);
            RendezVous savedRDV = hospitalService.saveRDV(rendezVous);

            //Add Consultation
            Consultation consultation = new Consultation();
            consultation.setDate(new Date());
            consultation.setRapport("Rapport ...");
            consultation.setRendezVous(savedRDV);
            hospitalService.saveConsultation(consultation);

            //Update patient
            hospitalService.updatePatient(new Patient(1L, "Patient4", new Date(), true, 20, null));

            //Delete patient
            hospitalService.deletePatient(hospitalService.searchPatient("Patient3"));
        };
    }
}
