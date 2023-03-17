package iterator;

import java.util.Iterator;

public class Instituto {

    public static void main(String[] args) {
        Grupo grupo = new Grupo("programacion");
        Alumno alumno1 = new Alumno("Lionel", "Messi", "Java");
        Alumno alumno2 = new Alumno("Julian", "Alvarez", "Python");
        Alumno alumno3 = new Alumno("Angel", "Dimaria", "Javascript");
        Alumno alumno4 = new Alumno("Enzo", "Fernandez", "Typescript");
        grupo.agregarAlumno(alumno1);grupo.agregarAlumno(alumno2);grupo.agregarAlumno(alumno3);grupo.agregarAlumno(alumno4);

        Iterator<Alumno> alumnos = grupo.iterator();  //El iterator nos permite recorrer los Alumnos del Array grupo

    while(alumnos.hasNext()){  //comprobamos que existan mas alumnos
        System.out.println(alumnos.next()); //imprimimos utilizando el metodo toString;
    }




    }
}
