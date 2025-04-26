package com.laboratorio.lab3.services;

import com.laboratorio.lab3.entidades.Hospital;
import com.laboratorio.lab3.Repositorys.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;


    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }

}
