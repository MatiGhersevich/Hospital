package com.hospitaltp.hospital;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Pacientes")
public class Paciente {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private int edad;
    private Fecha aceptado;
    private String [] prescripcion;
    private String [] alergias;
    private String [] requerimientosEspeciales;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    private Persona persona;
}
