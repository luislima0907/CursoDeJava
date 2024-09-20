package PracticaDePatronesDeComportamiento.Mediator.EjemploDos;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BotonDeOlvideLaClave extends JButton implements Componente {
    private Mediator mediator;

    public BotonDeOlvideLaClave() {
        super("Olvide la Clave");
    }

    public void AccionRealizada(ActionEvent evento){
        this.mediator.claveOlvidada();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getNombre() {
        return "Boton de Olvide la Clave";
    }
}
