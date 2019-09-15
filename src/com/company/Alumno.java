package com.company;

import java.util.List;

public class Alumno {

    //atributos
    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;
    List <Curso> listaDeCursosInscriptos;

    //Constructor
    public Alumno(String nombre, String apellido, Integer codigoDeAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }
    public List<Curso> getListaDeCursosInscriptos() {
        return listaDeCursosInscriptos;
    }
}
