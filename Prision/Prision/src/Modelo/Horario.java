
package Modelo;

import java.util.List;


public class Horario {
    private List<Jornada> jornadas;
    private int id,codigo;

    public Horario(List<Jornada> jornadas, int id, int codigo) {
        this.jornadas = jornadas;
        this.id = id;
        this.codigo = codigo;
    }

    public List<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(List<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
