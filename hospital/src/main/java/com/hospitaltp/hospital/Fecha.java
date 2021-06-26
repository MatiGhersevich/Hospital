package com.hospitaltp.hospital;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Fecha{
    private int dia;
    private int mes;
    private int anio;
}