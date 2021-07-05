
package Modelo;

import java.util.List;


public class EquipoTrabajo extends GrupoActividad {
    private float razonDiariaRedencion;

    public EquipoTrabajo(float razonDiariaRedencion, List<Recluso> reclusos, Horario horario, Actividad actividad, int id) {
        super(reclusos, horario, actividad, id);
        this.razonDiariaRedencion = razonDiariaRedencion;
    }

    public float getRazonDiariaRedencion() {
        return razonDiariaRedencion;
    }

    public void setRazonDiariaRedencion(float razonDiariaRedencion) {
        this.razonDiariaRedencion = razonDiariaRedencion;
    }
    
}
