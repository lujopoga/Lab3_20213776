package com.laboratorio.lab3.controllers;

import com.laboratorio.lab3.entidades.Doctor;
import com.laboratorio.lab3.services.DoctorService;
import com.laboratorio.lab3.services.PacienteService;
import org.springframework.ui.Model;
import com.laboratorio.lab3.entidades.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;


    @GetMapping("/pacientes")
    public String getAllDoctors(Model model) {
        List<Paciente> pacientes = pacienteService.findAll();
        model.addAttribute("doctores", pacientes);
        return "doctores";
    }



}
