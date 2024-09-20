package PracticaDePatronesDeComportamiento.Mediator.EjemploDos;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Dialogo implements Mediator{
    private final JTextField txtUsuario = new JTextField();
    private final JTextField txtClave = new JTextField();
    private final BotonDeIniciarSesion btnIniciarSesion = new BotonDeIniciarSesion();
    private final BotonDeOlvideLaClave btnOlvideLaClave = new BotonDeOlvideLaClave();

    public Dialogo() {
        btnIniciarSesion.setMediator(this);
        btnOlvideLaClave.setMediator(this);
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion...");
        String usuario = txtUsuario.getText();
        String clave = txtClave.getText();
    }

    @Override
    public void claveOlvidada() {
        System.out.println("Generando nueva clave");
        String usuario = txtUsuario.getText();
    }

    public void ingresarNombreDeUsuario(String nombreDeUsuario) {
        txtUsuario.setText(nombreDeUsuario);
        System.out.println(txtUsuario.getText());
    }

    public void ingresarClave(String clave) {
        txtClave.setText(clave);
        System.out.println(txtClave.getText());
    }

    public void simularClickDeBtnIniciarSesion() {
        btnIniciarSesion.AccionRealizada(new ActionEvent(this, 0, "login"));
    }

    public void simularClickDeBtnOlvideLaClave() {
        btnOlvideLaClave.AccionRealizada(new ActionEvent(this, 0, "forgot pass"));
    }
}
