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
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private DoctorRepository doctorRepository;


    @GetMapping("")
    public String listarPacientes(Model model) {
        List<Paciente> pacientes = pacienteRepository.findAll();
        model.addAttribute("pacientes", pacientes);
        return "pacienteFlow";
    }


    @GetMapping("/derivar")
    public String mostrarFormularioDerivacion(Model model) {
        List<Doctor> doctores = doctorRepository.findAll();
        model.addAttribute("doctores", doctores);
        return "formDerivar";
    }


    @PostMapping("/derivar")
    public String procesarDerivacion(@RequestParam("doctorActual") Long doctorActualId,
                                     @RequestParam("doctorNuevo") Long nuevoDoctorId) {
        pacienteRepository.derivarPacientes(doctorActualId, nuevoDoctorId);
        return "redirect:/pacientes";
    }
}
