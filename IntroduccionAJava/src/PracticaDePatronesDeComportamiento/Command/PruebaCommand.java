package PracticaDePatronesDeComportamiento.Command;

public class PruebaCommand {
    public static void main(String[] args) {
        Lampara lampara = new Lampara("Oled");
        ControlParaLampara control = new ControlParaLampara(lampara);
        control.EjecutarComando('E');
    }
}
