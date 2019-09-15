package com.company;

public class Curso {

    //atributos
    private String nombre;
    private Integer codigoDeCurso;

    //Constructor
    public Curso(String nombre, Integer codigoDeCurso) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }
    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }
}
