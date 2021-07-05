
package Modelo;


public class Docente extends Empleado{
    private String profesion;

    public Docente(int id, String codigo, String nombre, String apellidos, String genero, int edad, boolean estado, Usuario usuario, String profesion) {
        super(id, codigo, nombre, apellidos, genero, edad, estado, usuario);
        this.profesion = profesion;
    }

    public Docente(String codigo, String nombre, String apellidos, String genero, int edad, boolean estado, Usuario usuario, String profesion) {
        super(codigo, nombre, apellidos, genero, edad, estado, usuario);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
