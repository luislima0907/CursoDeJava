package PatronesCreacionales.PatronPrototype;

public class Guerrero extends Enemigo {
    private int resistencia;

    public Guerrero(int salud, int danio, int resistencia) {
        super(salud, danio);
        this.resistencia = resistencia;
    }

    public Guerrero(Guerrero guerrero) {
        super(guerrero);
        if(guerrero != null){
            setResistencia(guerrero.getResistencia());
        }
    }

    @Override
    public Enemigo Clonar() {
        return new Guerrero(this);
    }

    public int getResistencia() {
        return resistencia;
    }

    public Guerrero setResistencia(int resistencia) {
        this.resistencia = resistencia;
        return this;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "resistencia=" + resistencia +
                ", salud=" + salud +
                ", danio=" + danio +
                '}';
    }
}
