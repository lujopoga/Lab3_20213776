package com.laboratorio.lab3.controllers;

import org.springframework.ui.Model;
import com.laboratorio.lab3.entidades.Hospital;
import com.laboratorio.lab3.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/hospitales")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping
    public String listarHospitales(Model model) {
        List<Hospital> hospitales = hospitalService.findAll();
        model.addAttribute("hospitales", hospitales);
        return "hospitalList";
    }
}


