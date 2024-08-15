package PatronesEstructurales.Proxy;

import java.io.Serializable;
import java.util.Date;

public class Estados implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int nivel;
    private int kills;
    private int deaths;
    private Date fechaDeCreacionDeLaPartida;
    private Date fechaDeGuardado;

    public Estados(String nombre, int nivel, int kills, int deaths) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.kills = kills;
        this.deaths = deaths;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public Date getFechaDeCreacionDeLaPartida() {
        return fechaDeCreacionDeLaPartida;
    }

    public void setFechaDeCreacionDeLaPartida(Date fechaDeCreacionDeLaPartida) {
        this.fechaDeCreacionDeLaPartida = fechaDeCreacionDeLaPartida;
    }

    public Date getFechaDeGuardado() {
        return fechaDeGuardado;
    }

    public void setFechaDeGuardado(Date fechaDeGuardado) {
        this.fechaDeGuardado = fechaDeGuardado;
    }

    @Override
    public String toString() {
        return "Estados{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", fechaDeCreacionDeLaPartida=" + fechaDeCreacionDeLaPartida +
                ", fechaDeGuardado=" + fechaDeGuardado +
                '}';
    }
}
