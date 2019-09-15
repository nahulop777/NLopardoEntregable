package com.company;

public class ProfesorAdjunto extends Profesor{

    //Atributos
    private Integer cantidadDeHoras;

    //Constructor
    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer cantidadDeHoras) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.cantidadDeHoras = cantidadDeHoras;
    }
    //Getter
    public Integer getCantidadDeHoras() {
        return cantidadDeHoras;
    }
    //Setter
    public void setCantidadDeHoras(Integer cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }
}
