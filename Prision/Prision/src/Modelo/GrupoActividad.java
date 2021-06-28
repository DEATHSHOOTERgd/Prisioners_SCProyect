
package Modelo;

import java.util.List;


public abstract class GrupoActividad {
    private List<Recluso> reclusos;
    private Horario horario;
    private Actividad actividad;
    private int id;

    public GrupoActividad(List<Recluso> reclusos, Horario horario, Actividad actividad, int id) {
        this.reclusos = reclusos;
        this.horario = horario;
        this.actividad = actividad;
        this.id = id;
    }

    public List<Recluso> getReclusos() {
        return reclusos;
    }

    public void setReclusos(List<Recluso> reclusos) {
        this.reclusos = reclusos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
