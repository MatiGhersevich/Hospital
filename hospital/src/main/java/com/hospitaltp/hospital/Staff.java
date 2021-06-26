package com.hospitaltp.hospital;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    Fecha contratado;
    private String [] educacion;
    private String [] certificado;
    private String [] lenguaje;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @ManyToOne()
    @JoinColumn(name = "id_departamento")
    Departamento departamento;
}