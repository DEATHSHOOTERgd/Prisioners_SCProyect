
package Modelo;


public class Cargo {
    private String descripcion;
    private int condenaDias;

    public Cargo(String descripcion, int condenaDias) {
        this.descripcion = descripcion;
        this.condenaDias = condenaDias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCondenaDias() {
        return condenaDias;
    }

    public void setCondenaDias(int condenaDias) {
        this.condenaDias = condenaDias;
    }
    
}
