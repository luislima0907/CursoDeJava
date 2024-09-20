package PracticaDePatronesDeComportamiento.ChainOfResponsibility;

public class GestorDeRoles extends Controlador{

    @Override
    public boolean contralador(String nombreDeUsuario, String clave) {
        if ("usuarioAdmin".equals(nombreDeUsuario)) {
            System.out.println("Cargando app para el usuario admin");
            return true;
        }
        System.out.println("Cargando app para usuario normal");
        return siguienteControlador(nombreDeUsuario, clave);
    }
}
