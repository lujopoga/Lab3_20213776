package com.laboratorio.lab3.Repositories;

import com.laboratorio.lab3.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Paciente p SET p.doctor = (SELECT d FROM Doctor d WHERE d.id = :nuevoDoctorId) WHERE p.doctor.id = :doctorActualId")
    void derivarPacientes(@Param("doctorActualId") Long doctorActualId,
                          @Param("nuevoDoctorId") Long nuevoDoctorId);
}
