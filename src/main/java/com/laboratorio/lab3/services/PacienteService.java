package com.laboratorio.lab3.services;

import com.laboratorio.lab3.Repositorys.PacienteRepository;
import com.laboratorio.lab3.entidades.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }
}

