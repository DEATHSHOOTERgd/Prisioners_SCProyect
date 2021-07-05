
package Modelo;


public abstract class Persona {
    private int id;
    private String codigo;
    private String nombre;
    private String apellidos;
    private String genero;
    private int edad;

    public Persona(int id, String codigo, String nombre, String apellidos, String genero, int edad) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
    }
    public Persona(String codigo, String nombre, String apellidos, String genero, int edad) {
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
}
