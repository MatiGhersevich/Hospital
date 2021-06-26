package com.hospitaltp.hospital;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "Personas")
public class Persona {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String primerNombre;
    private String segundoNombre;
    private String apellido;
    private Fecha fechaNacim;
    private char genero;
    private Direccion dirección;
    private String telefono;

    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Staff staff;

    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Paciente paciente;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable (name="hospital-Persona",
                 joinColumns =  {@JoinColumn(name = "hospital_id")},
                 inverseJoinColumns = {@JoinColumn(name = "persona_id")})
    private Set<Hospital> hospital;
}
