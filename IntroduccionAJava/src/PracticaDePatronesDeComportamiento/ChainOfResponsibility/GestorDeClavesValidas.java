package PracticaDePatronesDeComportamiento.ChainOfResponsibility;

public class GestorDeClavesValidas extends Controlador{
    private BaseDeDatos baseDeDatos;

    public GestorDeClavesValidas(BaseDeDatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    @Override
    public boolean contralador(String nombreDeUsuario, String clave) {
        if (!baseDeDatos.esValidaLaClave(nombreDeUsuario, clave)) {
            System.out.println("Clave incorrecta, intentelo de nuevo");
            return false;
        }
        return siguienteControlador(nombreDeUsuario, clave);
    }
}
