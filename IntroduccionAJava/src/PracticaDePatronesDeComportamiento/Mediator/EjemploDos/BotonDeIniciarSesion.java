package PracticaDePatronesDeComportamiento.Mediator.EjemploDos;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BotonDeIniciarSesion extends JButton implements Componente {
    private Mediator mediator;

    public BotonDeIniciarSesion() {
        super("Iniciar Sesion");
    }

    protected void AccionRealizada(ActionEvent evento) {
        this.mediator.iniciarSesion();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getNombre() {
        return "Boton de Iniciar Sesion";
    }
}
