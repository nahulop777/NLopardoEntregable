package com.company;

import java.util.Date;

public class Inscripcion {
    private Alumno unAlumno;
    private Curso unCurso;
    private Date fechaDelDia;

    public Inscripcion(Alumno unAlumno, Curso unCurso) {
        this.unAlumno = unAlumno;
        this.unCurso = unCurso;
        fechaDelDia = new Date();
    }

    //Getter
    public Alumno getUnAlumno() {
        return unAlumno;
    }
    public Curso getUnCurso() {
        return unCurso;
    }
    public Date getFechaDelDia() {
        return fechaDelDia;
    }

    //Setter
    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }
    public void setUnCurso(Curso unCurso) {
        this.unCurso = unCurso;
    }
}
