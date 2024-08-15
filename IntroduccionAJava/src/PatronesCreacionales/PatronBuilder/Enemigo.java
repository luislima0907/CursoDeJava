package PatronesCreacionales.PatronBuilder;

public class Enemigo {
    // EJEMPLO DE COMO USAR EL PATRON BUILDER:
    private String nombre;
    private String tipo;
    private int salud;
    private int danio;
    private int resistencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public static EnemigoBuilder builder() {
        return new EnemigoBuilder();
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", salud=" + salud +
                ", danio=" + danio +
                ", resistencia=" + resistencia +
                '}';
    }
// Esto tendriamos que hacer si queremos construir un objeto
    // de la forma tradicional

    //private int edad;
//    private String nombre;
//    private String descripcion;
//
//    public Enemigo() {
//    }
//
//    public Enemigo(int edad) {
//        this.edad = edad;
//    }
//
//    public Enemigo(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public Enemigo(String nombre, int edad) {
//        this.nombre = nombre;
//        this.edad = edad;
//    }
}
