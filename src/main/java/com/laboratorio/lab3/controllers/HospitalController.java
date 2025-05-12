package com.laboratorio.lab3.controllers;

import com.laboratorio.lab3.entidades.Doctor;
import com.laboratorio.lab3.entidades.Hospital;
import com.laboratorio.lab3.entidades.Paciente;
import com.laboratorio.lab3.Repositories.DoctorRepository;
import com.laboratorio.lab3.Repositories.HospitalRepository;
import com.laboratorio.lab3.Repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hospitales")
public class HospitalController {

    @Autowired
    HospitalRepository hospitalRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PacienteRepository pacienteRepository;

    @GetMapping("")
    public String listarHospitales(Model model) {
        List<Hospital> hospitales = hospitalRepository.findAll();
        model.addAttribute("hospitales", hospitales);
        return "hospitalList";
    }

    @GetMapping("/{id}/doctores")
    public String mostrarDoctores(@PathVariable("id") Long id, Model model) {
        List<Doctor> doctores = doctorRepository.findByHospitalId(id);
        model.addAttribute("doctores", doctores);
        return "doctorList"; // aún no creado, lo harás luego
    }

    @GetMapping("/{id}/pacientes")
    public String mostrarPacientes(@PathVariable("id") Long id, Model model) {
        List<Paciente> pacientes = pacienteRepository.findByHospitalId(id);
        model.addAttribute("pacientes", pacientes);
        return "pacienteList"; // aún no creado, lo harás luego
    }
}
