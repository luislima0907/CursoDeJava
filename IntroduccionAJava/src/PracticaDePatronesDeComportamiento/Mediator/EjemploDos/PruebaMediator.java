package PracticaDePatronesDeComportamiento.Mediator.EjemploDos;

public class PruebaMediator {
    public static void main(String[] args) {
        Dialogo dialogo = new Dialogo();
        dialogo.ingresarNombreDeUsuario("Luis");
        dialogo.ingresarClave("332");
        dialogo.simularClickDeBtnIniciarSesion();
        dialogo.simularClickDeBtnOlvideLaClave();
    }
}
