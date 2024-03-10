package com.ilyaselmabrouki.spring_mvc.repository;

import com.ilyaselmabrouki.spring_mvc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("select p from Patient p where p.nom like %:nom%")
    List<Patient> searchPatientByNom(@Param("nom") String nom);

}
