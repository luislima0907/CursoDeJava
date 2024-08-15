package PatronesEstructurales.PatronDecorator.Raza;

import PatronesEstructurales.PatronDecorator.Enemigo;

public class Orco implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("Ataque de orco");
    }
}
