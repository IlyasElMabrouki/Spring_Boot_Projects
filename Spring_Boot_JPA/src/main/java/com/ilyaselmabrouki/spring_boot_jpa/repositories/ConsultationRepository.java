package com.ilyaselmabrouki.spring_boot_jpa.repositories;

import com.ilyaselmabrouki.spring_boot_jpa.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

}
