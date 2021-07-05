
package Modelo;

import java.util.List;

public class Expediente {
    private int codigo;
    private List<String> historialDelictivo;
    private List<Cargo> cargos;

    public Expediente(int codigo, List<String> historialDelictivo, List<Cargo> cargos) {
        this.codigo = codigo;
        this.historialDelictivo = historialDelictivo;
        this.cargos = cargos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<String> getHistorialDelictivo() {
        return historialDelictivo;
    }

    public void setHistorialDelictivo(List<String> historialDelictivo) {
        this.historialDelictivo = historialDelictivo;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
    
}
