package PatronesCreacionales.PatronPrototype;

public class Mago extends Enemigo{
    private int mana;

    public Mago(int salud, int danio, int mana) {
        super(salud, danio);
        this.mana = mana;
    }

    public Mago(Mago mago) {
        super(mago);
        if (mago != null){
            setMana(mago.getMana());
        }
    }

    @Override
    public Enemigo Clonar() {
        return new Mago(this);
    }

    public int getMana() {
        return mana;
    }

    public Mago setMana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "mana=" + mana +
                ", salud=" + salud +
                ", danio=" + danio +
                '}';
    }
}
