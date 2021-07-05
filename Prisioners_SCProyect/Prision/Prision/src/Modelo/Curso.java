
package Modelo;

import java.util.List;

public class Curso extends GrupoActividad {
    private int totalDiasRedencion;
    private int diasDuracion;

    public Curso(int totalDiasRedencion, int diasDuracion, List<Recluso> reclusos, Horario horario, Actividad actividad, int id) {
        super(reclusos, horario, actividad, id);
        this.totalDiasRedencion = totalDiasRedencion;
        this.diasDuracion = diasDuracion;
    }

    public int getTotalDiasRedencion() {
        return totalDiasRedencion;
    }

    public void setTotalDiasRedencion(int totalDiasRedencion) {
        this.totalDiasRedencion = totalDiasRedencion;
    }

    public int getDiasDuracion() {
        return diasDuracion;
    }

    public void setDiasDuracion(int diasDuracion) {
        this.diasDuracion = diasDuracion;
    }
    

  
    
}
