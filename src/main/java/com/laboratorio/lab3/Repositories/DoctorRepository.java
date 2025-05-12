package com.laboratorio.lab3.Repositories;
import com.laboratorio.lab3.entidades.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByHospitalId(Long hospitalId);  // query method automático
}
