package com.api.crud.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="alumno")
public class AlumnoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private int legajo;
    @Basic
    private String nombre;
    private String apellido;
    private int edad;



    public AlumnoModel() {
    }

    public AlumnoModel(int legajo, String nombre, String apellido, int edad) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
