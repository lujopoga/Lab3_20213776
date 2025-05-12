package com.laboratorio.lab3.controllers;

import com.laboratorio.lab3.entidades.Doctor;
import com.laboratorio.lab3.entidades.Paciente;
import com.laboratorio.lab3.Repositories.DoctorRepository;
import com.laboratorio.lab3.Repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/doctores")
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PacienteRepository pacienteRepository;

    @GetMapping("")
    public String listarDoctores(Model model) {
        List<Doctor> doctores = doctorRepository.findAll();
        model.addAttribute("doctores", doctores);
        return "doctorList";
    }

    @GetMapping("/{id}/citas")
    public String listarProximasCitas(@PathVariable("id") Long id, Model model) {
        List<Paciente> citas = pacienteRepository.obtenerPacientesPorDoctor(id);
        model.addAttribute("citas", citas);
        return "proximasCitas";
    }
}
