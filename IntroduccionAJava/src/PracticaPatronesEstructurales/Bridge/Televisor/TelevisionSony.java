package PracticaPatronesEstructurales.Bridge.Televisor;

import PracticaPatronesEstructurales.Bridge.ControlRemoto.ControlRemoto;

public class TelevisionSony extends Television{

    public TelevisionSony(ControlRemoto control) {
        super(control);
    }

    @Override
    public void encender() {
        System.out.println("La tele sony se esta encendiendo");
        control.encender();
    }

    @Override
    public void apagar() {
        System.out.println("La tele sony se esta apagando");
        control.apagar();
    }
}
