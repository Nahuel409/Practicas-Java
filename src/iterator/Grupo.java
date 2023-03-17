package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo implements Iterable<Alumno>{   //Implemetamos iterable para iterar sobre la clase alumnos
                                                   //Y agregamos solo su metodo iterator
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String nombre;
    ArrayList<Alumno> alumnos = new ArrayList<>();


    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }

    @Override
    public Iterator<Alumno> iterator() {
        return alumnos.iterator();
    }
}
