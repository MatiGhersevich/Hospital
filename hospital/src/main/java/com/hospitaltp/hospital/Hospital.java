package com.hospitaltp.hospital;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
@Entity
@Table(name = "Hospitales")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String telefono;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true)
    List <Departamento> departamento;

     @ManyToMany(mappedBy = "hospital")
    }
    