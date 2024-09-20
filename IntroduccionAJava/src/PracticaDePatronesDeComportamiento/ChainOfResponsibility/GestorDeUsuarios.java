package PracticaDePatronesDeComportamiento.ChainOfResponsibility;

public class GestorDeUsuarios extends Controlador{
    private final BaseDeDatos baseDeDatos;

    public GestorDeUsuarios(BaseDeDatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    @Override
    public boolean contralador(String nombreDeUsuario, String clave) {
        if (!baseDeDatos.esValidoElUsuario(nombreDeUsuario)) {
            System.out.println("El nombre de usuario no esta registrado en nuestra base");
            System.out.println("Registrate ahora mismo para poder ingresar");
            return false;
        }
        return siguienteControlador(nombreDeUsuario, clave);
    }
}
