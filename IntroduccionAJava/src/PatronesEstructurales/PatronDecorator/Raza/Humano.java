package PatronesEstructurales.PatronDecorator.Raza;


import PatronesEstructurales.PatronDecorator.Enemigo;

public class Humano implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("Ataque humano");
    }
}
