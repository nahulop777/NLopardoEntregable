package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DigitalHouseManager DHM = new DigitalHouseManager();
        //2. Dar de alta dos profesores titulares y dos profesores adjuntos. (Inventar todos sus valores)
        DHM.altaProfesorTitular("Pedro","Gomez",1234,"Full Stack");
        DHM.altaProfesorTitular("Miguel","Perez",4321,"Android");
        DHM.altaProfesorAdjunto("Agustin","Garcia",2323,30);
        DHM.altaProfesorAdjunto("Joaquin","Villarino",3232,50);
        //3. Dar de alta dos cursos.
        DHM.altaCurso("Full Stack",20001,3);
        DHM.altaCurso("Android",20002,2);
        //4. Asignarle un profesor titular y un adjunto a cada curso.
        DHM.asignarProfesores(20001,1234,2323);
        DHM.asignarProfesores(20002,4321,3232);
        //5. Dar de alta a tres alumnos. (Inventar todos sus valores).
        DHM.altaAlumno("Nahuel","Lopardo",0707);
        DHM.altaAlumno("Gerardo","Galun",7070);
        DHM.altaAlumno("Dante","Vita",4545);
        //6. Inscribir a dos alumnos en el curso de Full Stack.
        DHM.inscribirAlumno(0707,20001);
        DHM.inscribirAlumno(7070,20001);
        //7. Inscribir a tres alumnos en el curso de Android.
        DHM.inscribirAlumno(0707,20002);
        DHM.inscribirAlumno(7070,20002);
        DHM.inscribirAlumno(4545,20002);
        //8. Dar de baja un profesor
        DHM.bajaProfesor(1234);
        //9. Dar de baja un curso.
        DHM.bajaCurso(20001);
        //10
        //¿Cómo modificaría el diagrama de clases para que se le pueda consultar a un alumno a qué
        //cursos está inscripto?

        //En la clase Alumno crearia el array cursosInscriptos para que cada vez que se ejecute
        //el metodo inscribirAlumno ademas de agregar el Alumno al Curso tmb se agregue el curso a un array dentro
        // del alumno. Luego crearia el metodo consultarInscripciones que recibiria un Integer codigoAlumno
        // y luego de encontrar el alumno devolveria el contenido de este array con cursos

    }
}
