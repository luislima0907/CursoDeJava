package PatronesEstructurales.Bridge;

import PatronesEstructurales.Bridge.Enemigo.Guerrero;
import PatronesEstructurales.Bridge.Enemigo.Mago;
import PatronesEstructurales.Bridge.Luchador.GuerreroLuchadorImplementado;
import PatronesEstructurales.Bridge.Luchador.MagoLuchadorImplementado;

public class PruebaDeBridge {
    public static void main(String[] args) {
        System.out.println("--------Guerrero--------");
        Guerrero guerrero = new Guerrero();
        guerrero.atacar();
        guerrero.defender();
        guerrero.setLuchador(new MagoLuchadorImplementado());
        guerrero.atacar();
        guerrero.defender();
        System.out.println("--------Mago--------");
        Mago mago = new Mago();
        mago.atacar();
        mago.defender();
        mago.setLuchador(new GuerreroLuchadorImplementado());
        mago.atacar();
        mago.defender();
    }
}
