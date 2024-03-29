package com.company;
import java.util.ArrayList;
import java.util.List;

public class Curso {

    //atributos
    private String nombre;
    private Integer codigoDeCurso;
    private ProfesorTitular unTitular;
    private ProfesorAdjunto unAdjunto;
    private Integer cupoMaximo;
    List<Alumno> listaDeAlumnos;

    //Constructor
    public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximo) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.unTitular = unTitular;
        this.unAdjunto = unAdjunto;
        this.cupoMaximo = cupoMaximo;
        this.listaDeAlumnos = new ArrayList<>();

    }

    //Agregar y Eliminar alumno
    public Boolean agregarUnAlumno(Alumno unAlumno) {

        if (listaDeAlumnos.size() < cupoMaximo) {
            listaDeAlumnos.add(unAlumno);
            System.out.println("Alumno agregado correctamente");
            return true;
        } else {
            System.out.println("Alumno no pudo ser agregado");
            return false;
        }
    }
    public void eliminarAlumno (Alumno unAlumno){
        listaDeAlumnos.remove(unAlumno);
    }


    //Getter
    public String getNombre() {
        return nombre;
    }
    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }
    public ProfesorTitular getUnTitular() {
        return unTitular;
    }
    public ProfesorAdjunto getUnAdjunto() {
        return unAdjunto;
    }
    public Integer getCupoMaximo() {
        return cupoMaximo;
    }
    public List<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }
    public void setUnTitular(ProfesorTitular unTitular) {
        this.unTitular = unTitular;
    }
    public void setUnAdjunto(ProfesorAdjunto unAdjunto) {
        this.unAdjunto = unAdjunto;
    }
    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }
}
