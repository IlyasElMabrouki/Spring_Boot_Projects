package com.ilyaselmabrouki.spring_boot_jpa.entities;

public class RendezVous {
    private Long id;
    private String date;
    private StatusRDV status;
    private Patient patient;
    private Medecin medecin;
}
