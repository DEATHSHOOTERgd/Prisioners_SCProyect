
package Modelo;


public abstract class Empleado extends Persona {
    private boolean estado;
    private Usuario usuario;

    public Empleado(int id, String codigo, String nombre, String apellidos, String genero, int edad, boolean estado, Usuario usuario) {
        super(id, codigo, nombre, apellidos, genero, edad);
        this.estado = estado;
        this.usuario = usuario;
    }
    public Empleado( String codigo, String nombre, String apellidos, String genero, int edad, boolean estado, Usuario usuario) {
        super(codigo, nombre, apellidos, genero, edad);
        this.estado = estado;
        this.usuario = usuario;
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
