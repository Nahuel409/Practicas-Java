package iterator;

public class Alumno {
    private String nombre;
   private String apellido;
    private String clase;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String clase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", clase='" + clase + '\'' +
                '}';
    }
}
