package com.hospitaltp.hospital;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import java.util.List;

import lombok.Data;

@Data
@Entity
@Table(name = "Departamentos")
public class Departamento {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nombre;

    @ManyToOne()
    @JoinColumn(name = "id_hospital")
    Hospital hospital;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, orphanRemoval = true)
    List <Staff> staff;
}