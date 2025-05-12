package com.laboratorio.lab3.entidades;
import jakarta.persistence.*;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctores;

    @OneToMany(mappedBy = "hospital")
    private List<Paciente> pacientes;


}

