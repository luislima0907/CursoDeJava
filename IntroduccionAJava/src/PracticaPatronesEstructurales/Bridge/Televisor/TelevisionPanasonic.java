package PracticaPatronesEstructurales.Bridge.Televisor;

import PracticaPatronesEstructurales.Bridge.ControlRemoto.ControlRemoto;

public class TelevisionPanasonic extends Television{

    public TelevisionPanasonic(ControlRemoto control) {
        super(control);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo televisor panasonic");
        control.encender();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando televisor panasonic");
        control.apagar();
    }
}
