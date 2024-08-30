package PracticaPatronesEstructurales.Bridge.Televisor;

import PracticaPatronesEstructurales.Bridge.ControlRemoto.ControlRemoto;

public abstract class Television {

    protected ControlRemoto control; // esto hace que funcione el patron Bridge

    public Television(ControlRemoto control) {
        this.control = control;
    }

    public abstract void encender();
    public abstract void apagar();

}
