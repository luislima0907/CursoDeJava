package PracticaPatronesEstructurales.Proxy.PracticaUno;

public class Usuario {
    private String nombre;
    private String clave;
    private String tipoDeUsuario;

    public Usuario(String nombre, String clave, String tipoDeUsuario) {
        this.nombre = nombre;
        this.clave = clave;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }
}
