package PracticaDePatronesDeComportamiento.Command;

import java.util.HashMap;

public class ControlParaLampara {
    private HashMap<Character, Comando> comandos = new HashMap<>();
    private Lampara lampara;

    public ControlParaLampara(Lampara lampara) {
        this.lampara = lampara;
        comandos.put('E', new ComandoParaEncender(lampara));
        comandos.put('A', new ComandoParaApagar(lampara));
    }

    public void EjecutarComando(Character comando) {
        if (!comandos.containsKey(comando)) {
            System.out.println("El comando no existe");
        } else {
            comandos.get(comando).ejecutar();
        }
    }
}
