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

    //ALTAS
    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso unCurso = new Curso(nombre,codigoCurso,cupoMaximoDealumnos);
        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoDeCurso().equals(unCurso.getCodigoDeCurso())) {
                System.out.println("El curso ya estaba inscripto");
                return;
            }
        }
        listaDeCursos.add(unCurso);
        System.out.println("Curso Agregada Correctamente");
    }
    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {

        Profesor unProfesor = new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras);
        for (Profesor profesorAdjunto : listaDeProfesores) {
            if (profesorAdjunto.getCodigoDeProfesor().equals(unProfesor.getCodigoDeProfesor())) {
                System.out.println("El profesor ya estaba inscripto");
                return;
            }
        }
        listaDeProfesores.add(unProfesor);
        System.out.println("Profesor Adjunto agregado correctamente");
    }
    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {

        Profesor unProfesor = new ProfesorTitular(nombre, apellido, 0, codigoProfesor, especialidad);
        for (Profesor profesorTitular : listaDeProfesores) {
            if (profesorTitular.getCodigoDeProfesor().equals(unProfesor.getCodigoDeProfesor())) {
                System.out.println("El profesor ya estaba inscripto");
                return;
            }

        }
        listaDeProfesores.add(unProfesor);
        System.out.println("Profesor Titular agregado correctamente");
    }
    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno unAlumno = new Alumno(nombre, apellido, codigoAlumno);
        for (Alumno alumno : listaDeAlumnosDH) {
            if (alumno.getCodigoDeAlumno().equals(unAlumno.getCodigoDeAlumno())) {
                System.out.println("El alumno ya esta inscripto");
                return;
            }
        }
        listaDeAlumnosDH.add(unAlumno);
        System.out.println("Alumno agregado correctamente");

    }
    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {

        Curso cursoBuscado = null;
        for (Curso unCurso : listaDeCursos) {
            if (unCurso.getCodigoDeCurso().equals(codigoCurso)) {
                cursoBuscado = unCurso;
                break;
            }
        }
        if (cursoBuscado == null) {
            System.out.println("El Curso no esta inscripto");
            return;
        }
        Alumno alummnoBuscado = null;
        for (Alumno unAlumno : listaDeAlumnosDH) {
            if (unAlumno.getCodigoDeAlumno().equals(codigoAlumno)) {
                alummnoBuscado = unAlumno;
                break;
            }
        }
        if (alummnoBuscado == null) {
            System.out.println("El Alumno no esta inscripto");
            return;
        }
        if (cursoBuscado.agregarUnAlumno(alummnoBuscado)) {
            Inscripcion unaInscripcion = new Inscripcion(alummnoBuscado, cursoBuscado);
            listaDeInscripciones.add(unaInscripcion);
            System.out.println("Inscripcion Realizada");
            return;
        } else {
            System.out.println("Inscripcion no pudo ser realizada");
        }

    }
    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {

        Curso cursoBuscado = null;
        for (Curso unCurso : listaDeCursos) {
            if (unCurso.getCodigoDeCurso().equals(codigoCurso)) {
                cursoBuscado = unCurso;
                break;
            }
        }
        if (cursoBuscado == null) {
            System.out.println("El Curso no esta inscripto");
            return;
        }

        ProfesorTitular profesorBuscado = null;
        for (Profesor unProfesorTitular : listaDeProfesores) {
            if (unProfesorTitular.getCodigoDeProfesor().equals(codigoProfesorTitular)) {
                profesorBuscado = (ProfesorTitular) unProfesorTitular;
                cursoBuscado.setUnTitular(profesorBuscado);
                System.out.println("Profesor Titular asignado al curso");
                break;
            }
        }
        if (profesorBuscado == null) {
            System.out.println("Profesor titular no Inscripto");
        }

        ProfesorAdjunto profesorAdBuscado = null;
        for (Profesor unProfesorAdjunto : listaDeProfesores) {
            if (unProfesorAdjunto.getCodigoDeProfesor().equals(codigoProfesorAdjunto)) {
                profesorAdBuscado = (ProfesorAdjunto) unProfesorAdjunto;
                cursoBuscado.setUnAdjunto(profesorAdBuscado);
                System.out.println("Profesor adjunto agregado al curso");
                break;
            }
        }
        if (profesorAdBuscado == null) {
            System.out.println("Profesor adjunto no inscripto");
        }

    }

    //BAJAS
    public void bajaCurso(Integer codigoCurso) {

        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoDeCurso().equals(codigoCurso)) {
                listaDeCursos.remove(curso);
                System.out.println("Curso eliminado");
                return;
            }
        }
        System.out.println("El curso no esta inscripto");
    }
    public void bajaProfesor(Integer codigoProfesor) {

        for (Profesor profesor : listaDeProfesores) {
            if (profesor.getCodigoDeProfesor().equals(codigoProfesor)) {
                listaDeCursos.remove(profesor);
                System.out.println("Profesor eliminado");
                return;
            }
        }
        System.out.println("El profesor no esta inscripto");
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

