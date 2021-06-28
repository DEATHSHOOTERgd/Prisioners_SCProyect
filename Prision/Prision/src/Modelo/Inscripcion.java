
package Modelo;

import java.time.LocalDate;


public class Inscripcion {
    private Recluso recluso;
    private Actividad actividad;
    private LocalDate fecha;
    private  int codigoInscripcion; 

    public Inscripcion(Recluso recluso, Actividad actividad, LocalDate fecha, int codigoInscripcion) {
        this.recluso = recluso;
        this.actividad = actividad;
        this.fecha = fecha;
        this.codigoInscripcion = codigoInscripcion;
    }

    public Recluso getRecluso() {
        return recluso;
    }

    public void setRecluso(Recluso recluso) {
        this.recluso = recluso;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCodigoInscripcion() {
        return codigoInscripcion;
    }

    public void setCodigoInscripcion(int codigoInscripcion) {
        this.codigoInscripcion = codigoInscripcion;
    }
    
}
