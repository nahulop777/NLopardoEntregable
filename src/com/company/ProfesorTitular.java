package com.company;

public class ProfesorTitular extends Profesor {

    //Atributos
    private String especialidad;

    //Constructor
    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.especialidad = especialidad;
    }
    //Getter
    public String getEspecialidad() {
        return especialidad;
    }
    //Setter
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
