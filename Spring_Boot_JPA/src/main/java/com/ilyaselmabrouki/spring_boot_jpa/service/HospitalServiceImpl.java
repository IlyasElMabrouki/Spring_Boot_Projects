package com.ilyaselmabrouki.spring_boot_jpa.service;

import com.ilyaselmabrouki.spring_boot_jpa.entities.Consultation;
import com.ilyaselmabrouki.spring_boot_jpa.entities.Medecin;
import com.ilyaselmabrouki.spring_boot_jpa.entities.Patient;
import com.ilyaselmabrouki.spring_boot_jpa.entities.RendezVous;
import com.ilyaselmabrouki.spring_boot_jpa.repositories.ConsultationRepository;
import com.ilyaselmabrouki.spring_boot_jpa.repositories.MedecinRepository;
import com.ilyaselmabrouki.spring_boot_jpa.repositories.PatientRepository;
import com.ilyaselmabrouki.spring_boot_jpa.repositories.RendezVousRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private final PatientRepository patientRepository;
    private final MedecinRepository medecinRepository;
    private final RendezVousRepository rendezVousRepository;
    private final ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository,
                               MedecinRepository medecinRepository,
                               RendezVousRepository rendezVousRepository,
                               ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient searchPatient(String nom) {
        return patientRepository.findByNom(nom);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public Medecin searchMedecin(String nom) {
        return medecinRepository.findByNom(nom);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public RendezVous getRDV(Long id) {
        return rendezVousRepository.findById(id).get();
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
