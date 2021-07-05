
package Modelo;

import java.time.LocalDate;


public class Jornada {
    private int id;
    private String dia;
    private LocalDate horaInicio;
    private LocalDate horaFin;

    public Jornada(int id, String dia, LocalDate horaInicio, LocalDate horaFin) {
        this.id = id;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDate horaFin) {
        this.horaFin = horaFin;
    }
    
    
}
