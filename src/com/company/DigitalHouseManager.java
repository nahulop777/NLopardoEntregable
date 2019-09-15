package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    List<Alumno> listaDeAlumnosDH;
    List<Profesor> listaDeProfesores;
    List<Curso> listaDeCursos;
    List<Inscripcion> listaDeInscripciones;

    public DigitalHouseManager() {
        listaDeProfesores = new ArrayList<>();
        listaDeCursos = new ArrayList<>();
        listaDeAlumnosDH = new ArrayList<>();
        listaDeInscripciones = new ArrayList<>();
    }


    //Getter
    public List<Alumno> getListaDeAlumnosDH() {
        return listaDeAlumnosDH;
    }
    public List<Profesor> getListaDeProfesores() {
        return listaDeProfesores;
    }
    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }
    public List<Inscripcion> getListaDeInscripciones() {
        return listaDeInscripciones;
    }
}

