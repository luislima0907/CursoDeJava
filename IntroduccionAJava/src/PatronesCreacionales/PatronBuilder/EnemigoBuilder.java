package PatronesCreacionales.PatronBuilder;

public class EnemigoBuilder {
    private String nombre;
    private String tipo;
    private int salud;
    private int danio;
    private int resistencia;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSalud() {
        return salud;
    }

    public int getDanio() {
        return danio;
    }

    public int getResistencia() {
        return resistencia;
    }

    public EnemigoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EnemigoBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public EnemigoBuilder salud(int salud) {
        this.salud = salud;
        return this;
    }

    public EnemigoBuilder danio(int danio) {
        this.danio = danio;
        return this;
    }

    public EnemigoBuilder resistencia(int resistencia) {
        this.resistencia = resistencia;
        return this;
    }

    public Enemigo build() {
        Enemigo enemigo = new Enemigo();
        enemigo.setNombre(getNombre());
        enemigo.setTipo(getTipo());
        enemigo.setSalud(getSalud());
        enemigo.setResistencia(getResistencia());
        enemigo.setDanio(getDanio());
        return enemigo;
    }

}
