package com.dataindev.person.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.lang.reflect.Array;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre,apellido;
    private int edad;
    private String Experiencia, Proyectos,Estudios, SobreMi; // EL TIPO STRING SOLO ES A MODO ILUSTRATIVO


}
