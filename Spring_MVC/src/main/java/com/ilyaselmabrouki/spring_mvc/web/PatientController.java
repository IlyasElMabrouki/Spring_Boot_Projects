package com.ilyaselmabrouki.spring_mvc.web;

import com.ilyaselmabrouki.spring_mvc.entities.Patient;
import com.ilyaselmabrouki.spring_mvc.repository.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping(value = "/delete")
    public String delete(Long id, String keyword, int page){
        patientRepository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }

    @GetMapping(value = "/formPatient")
    public String formPatient(Model model){
        model.addAttribute("patient", new Patient());
        return "formPatient";
    }

    @PostMapping(path = "/save")
    public String save(Model model, @Valid Patient patient, BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "formPatient";
        patientRepository.save(patient);
        return "redirect:/formPatient";
    }
}
