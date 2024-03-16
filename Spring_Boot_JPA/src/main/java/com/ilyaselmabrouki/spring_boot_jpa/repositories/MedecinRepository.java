package com.ilyaselmabrouki.spring_boot_jpa.repositories;

import com.ilyaselmabrouki.spring_boot_jpa.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
