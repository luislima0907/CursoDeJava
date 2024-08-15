package PatronesDeComportamiento.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Combate> combates = new ArrayList<>();

    public void agregar(Combate combate) {
        combates.add(combate);
    }

    public void enviar(Combate combate){
        for(Combate combate1 : combates){
            if(combate1 != combate){
                combate1.recibir(combate);
            }
        }
    }
}
