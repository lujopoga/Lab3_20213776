package com.laboratorio.lab3.entidades;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "especialidad")
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;


}

