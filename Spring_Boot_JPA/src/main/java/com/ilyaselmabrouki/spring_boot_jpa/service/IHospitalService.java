package com.ilyaselmabrouki.spring_boot_jpa.service;

import com.ilyaselmabrouki.spring_boot_jpa.entities.Consultation;
import com.ilyaselmabrouki.spring_boot_jpa.entities.Medecin;
import com.ilyaselmabrouki.spring_boot_jpa.entities.Patient;
import com.ilyaselmabrouki.spring_boot_jpa.entities.RendezVous;

import java.util.List;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Patient updatePatient(Patient patient);
    void deletePatient(Patient patient);
    List<Patient> getPatients();
    Patient searchPatient(String nom);
    Medecin saveMedecin(Medecin medecin);
    Medecin searchMedecin(String nom);
    RendezVous saveRDV(RendezVous rendezVous);
    RendezVous getRDV(Long id);
    Consultation saveConsultation(Consultation consultation);
}
