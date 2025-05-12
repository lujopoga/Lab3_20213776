package com.laboratorio.lab3.Repositories;

import com.laboratorio.lab3.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findByHospitalId(Long hospitalId);  // query method automático
}
