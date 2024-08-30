package PracticaPatronesEstructurales.Bridge;

import PracticaPatronesEstructurales.Bridge.ControlRemoto.ControlRemotoNuevo;
import PracticaPatronesEstructurales.Bridge.ControlRemoto.ControlRemotoViejo;
import PracticaPatronesEstructurales.Bridge.Televisor.Television;
import PracticaPatronesEstructurales.Bridge.Televisor.TelevisionPanasonic;
import PracticaPatronesEstructurales.Bridge.Televisor.TelevisionSony;

public class Cliente {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------");

        Television televisionSony = new TelevisionSony(new ControlRemotoNuevo());
        televisionSony.encender();
        televisionSony.apagar();

        System.out.println("----------------------------------------------------");

        Television televisionSony2 = new TelevisionSony(new ControlRemotoViejo());
        televisionSony2.encender();
        televisionSony2.apagar();

        System.out.println("----------------------------------------------------");

        Television televisionPanasonic = new TelevisionPanasonic(new ControlRemotoNuevo());
        televisionPanasonic.encender();
        televisionPanasonic.apagar();

        System.out.println("----------------------------------------------------");

        Television televisionPanasonic2 = new TelevisionPanasonic(new ControlRemotoViejo());
        televisionPanasonic2.encender();
        televisionPanasonic2.apagar();

        System.out.println("----------------------------------------------------");
    }
}
