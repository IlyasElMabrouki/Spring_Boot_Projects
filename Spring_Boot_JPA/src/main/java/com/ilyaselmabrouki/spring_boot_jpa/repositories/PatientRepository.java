package com.ilyaselmabrouki.spring_boot_jpa.repositories;

import com.ilyaselmabrouki.spring_boot_jpa.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByNom(String nom);

}
