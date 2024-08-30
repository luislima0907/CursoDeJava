package PracticaPatronesEstructurales.Proxy.PracticaUno;

public class PruebaDelPatronProxy {
    public static void main(String[] args) {
        //Ejemplo del Patron Proxy(Filtrado)
        final String usuarioTipoAdministrador = "Administrador";
        final String usuarioTipoEmpleado = "Empleado";
        EjecutorDeBaseDeDatosImplementado consulta = new EjecutorDeBaseDeDatosImplementado();
        //consulta.EjecutarConsulta("Delete");

        Usuario usuarioAdministrador = new Usuario("Luis", "331214j$", usuarioTipoAdministrador);
        Usuario usuarioEmpleado = new Usuario("Fernan", "5582j$", usuarioTipoEmpleado);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("CONSULTA DE: " + usuarioAdministrador.getNombre() + " con rol de: " + usuarioAdministrador.getTipoDeUsuario());
        EjecutorDeBaseDeDatos usuarioSiAdmin = new EjecutadorDeBaseDeDatosProxy(usuarioAdministrador);
        usuarioSiAdmin.EjecutarConsulta("DELETE FROM alumno where id = 1");

        System.out.println("------------------------------------------------------------------------");

        System.out.println("CONSULTA DE: " + usuarioEmpleado.getNombre() + " con rol de: " + usuarioEmpleado.getTipoDeUsuario());
        EjecutorDeBaseDeDatos usuarioNoAdmin = new EjecutadorDeBaseDeDatosProxy(usuarioEmpleado);
        usuarioNoAdmin.EjecutarConsulta("DELETE FROM alumno where id = 1");

        System.out.println("------------------------------------------------------------------------");
    }
}
