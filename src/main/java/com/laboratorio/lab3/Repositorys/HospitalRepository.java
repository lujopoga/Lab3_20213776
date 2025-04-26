package com.laboratorio.lab3.Repositorys;

import com.laboratorio.lab3.entidades.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
