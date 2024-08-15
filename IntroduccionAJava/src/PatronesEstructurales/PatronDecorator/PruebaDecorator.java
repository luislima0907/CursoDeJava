package PatronesEstructurales.PatronDecorator;

import PatronesEstructurales.PatronDecorator.Decorator.AsesinoDecorator;
import PatronesEstructurales.PatronDecorator.Decorator.GuerreroDecorator;
import PatronesEstructurales.PatronDecorator.Decorator.MagoDecorator;
import PatronesEstructurales.PatronDecorator.Raza.Elfo;
import PatronesEstructurales.PatronDecorator.Raza.Humano;

public class PruebaDecorator {
    public static void main(String[] args) {
        System.out.println("HUMANO Y GUERRERO");
        Enemigo humanoGuerrero = new GuerreroDecorator(new Humano());
        humanoGuerrero.atacar();
        System.out.println("HUMANO, GUERRERO Y MAGO");
        Enemigo humanoGuerreroMago = new GuerreroDecorator(new MagoDecorator(new Humano()));
        humanoGuerreroMago.atacar();
        System.out.println("ELFO, GUERRERO, MAGO Y ASESINO");
        Enemigo elfoGuerreroMagoAsesino = new GuerreroDecorator(new MagoDecorator(new AsesinoDecorator(new Elfo())));
        elfoGuerreroMagoAsesino.atacar();
    }
}
