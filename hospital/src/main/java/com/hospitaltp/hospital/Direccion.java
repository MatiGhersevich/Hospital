package com.hospitaltp.hospital;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Direccion{
    private String calle;
    private int nro;
}