package com.laboratorio.lab3.Repositorys;

import com.laboratorio.lab3.entidades.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}







