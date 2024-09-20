package PracticaDePatronesDeComportamiento.ChainOfResponsibility;

public class PruebaChainOfResponsibility {
    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        Controlador manejador = new GestorDeUsuarios(bd);
        manejador.setSiguienteControlador(new GestorDeClavesValidas(bd))
                .setSiguienteControlador(new GestorDeRoles());
        ServicioDeAutenticacion autenticacion = new ServicioDeAutenticacion(manejador);

        System.out.println("---------------------------");
        System.out.println(autenticacion.iniciarSesion("admin", ""));
        System.out.println("---------------------------");
        System.out.println(autenticacion.iniciarSesion("usuarioNormal", "claveNormal"));
        System.out.println("---------------------------");
        System.out.println(autenticacion.iniciarSesion("usuarioAdmin", "claveAdmin"));
        System.out.println("---------------------------");
    }
}
