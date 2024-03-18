package com.ilyaselmabrouki.spring_mvc;

import com.ilyaselmabrouki.spring_mvc.entities.Patient;
import com.ilyaselmabrouki.spring_mvc.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		/*patientRepository.save(new Patient(null, "Patient1", new Date(), false, 10));
		patientRepository.save(new Patient(null, "Patient2", new Date(), true, 20));
		patientRepository.save(new Patient(null, "Patient3", new Date(), false, 30));*/

        List<Patient> patientsV1 = patientRepository.findAll();
        System.out.println("Liste des patients:");
        patientsV1.forEach(p -> {
            System.out.println(p.toString());
        });
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
