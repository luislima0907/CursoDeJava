package PatronesEstructurales.Bridge.Enemigo;

import PatronesEstructurales.Bridge.Luchador.GuerreroLuchadorImplementado;
import PatronesEstructurales.Bridge.Luchador.Luchador;

public class Guerrero extends Enemigo {

    public Guerrero() {
        setLuchador(new GuerreroLuchadorImplementado());
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
        System.out.println("El guerrero: ");
        getLuchador().atacar();
    }

    public void defender() {
        System.out.println("El guerrero: ");
        getLuchador().defender();
    }

    @Override
    public Luchador getLuchador() {
        return super.getLuchador();
    }

    @Override
    public void setLuchador(Luchador luchador) {
        super.setLuchador(luchador);
    }
}
