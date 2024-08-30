package PracticaPatronesEstructurales.Proxy.PracticaUno;

public class EjecutadorDeBaseDeDatosProxy implements EjecutorDeBaseDeDatos{
    private boolean permiso = false;
    private EjecutorDeBaseDeDatosImplementado ejecutorDeBaseDeDatos;

    public EjecutadorDeBaseDeDatosProxy(Usuario usuario) {
        if (usuario.getTipoDeUsuario().equals("Administrador")) {
            permiso = true;
        }
        ejecutorDeBaseDeDatos = new EjecutorDeBaseDeDatosImplementado();
    }

    @Override
    public void EjecutarConsulta(String consulta) {
        if(permiso){
            ejecutorDeBaseDeDatos.EjecutarConsulta(consulta);
        } else {
            if (consulta.contains("DELETE")) {
                throw new UnsupportedOperationException("La consulta 'DELETE' no puede ser usada por" +
                        " usuarios que no sean de tipo Administrador, tu usuario es de tipo Empleado");
            } else {
                ejecutorDeBaseDeDatos.EjecutarConsulta(consulta);
            }
        }
    }
}
