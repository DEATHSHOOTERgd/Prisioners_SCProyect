
package Modelo;

public class Recluso extends Persona {
    private Expediente expediente;

    public Recluso(int id, String codigo, String nombre, String apellidos, String genero, int edad, Expediente expediente) {
        super(id, codigo, nombre, apellidos, genero, edad);
        this.expediente = expediente;
    }
    public Recluso(String codigo, String nombre, String apellidos, String genero, int edad, Expediente expediente) {
        super(codigo, nombre, apellidos, genero, edad);
        this.expediente = expediente;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
    
}
