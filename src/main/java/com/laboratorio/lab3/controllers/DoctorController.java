package com.laboratorio.lab3.controllers;


import com.laboratorio.lab3.services.DoctorService;
import org.springframework.ui.Model;
import com.laboratorio.lab3.entidades.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/doctores")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;


    @GetMapping("/doctores")
    public String getAllDoctors(Model model) {
        List<Doctor> doctores = doctorService.findAll();
        model.addAttribute("doctores", doctores);
        return "doctores";
    }



}
