package com.laboratorio.lab3.services;

import com.laboratorio.lab3.Repositorys.DoctorRepository;
import com.laboratorio.lab3.entidades.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }
}
