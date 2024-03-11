package com.ilyaselmabrouki.spring_mvc.web;

import com.ilyaselmabrouki.spring_mvc.entities.Patient;
import com.ilyaselmabrouki.spring_mvc.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping(value = "/index")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int p,
                        @RequestParam(name = "size", defaultValue = "5") int s,
                        @RequestParam(name = "keyword", defaultValue = "") String kw){
        Page<Patient> pagePatients = patientRepository.search(kw, PageRequest.of(p, s, Sort.unsorted()));
        model.addAttribute("listPatients", pagePatients.getContent());
        model.addAttribute("pages", new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage", p);
        model.addAttribute("keyword", kw);
        return "patients";
    }
}
