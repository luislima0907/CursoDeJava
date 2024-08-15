package PatronesEstructurales.Bridge.Enemigo;

import PatronesEstructurales.Bridge.Luchador.MagoLuchadorImplementado;

public class Mago extends Enemigo {
    public Mago() {
        setLuchador(new MagoLuchadorImplementado());
    }

    @Override
    public int getSalud() {
        return super.getSalud();
    }

    @Override
    public void setSalud(int salud) {
        super.setSalud(salud);
    }

    public void atacar() {
        System.out.println("El mago:");
        getLuchador().atacar();
    }

    public void defender() {
        System.out.println("El mago:");
        getLuchador().defender();
    }
}
