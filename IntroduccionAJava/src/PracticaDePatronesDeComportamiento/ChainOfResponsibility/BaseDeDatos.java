package PracticaDePatronesDeComportamiento.ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
    private final Map<String, String> usuarios;

    public BaseDeDatos(){
        usuarios = new HashMap<>();
        usuarios.put("usuarioAdmin", "claveAdmin");
        usuarios.put("usuarioNormal", "claveNormal");
    }

    public boolean esValidoElUsuario(String usuario){
        return usuarios.containsKey(usuario);
    }

    public boolean esValidaLaClave(String usuario, String clave){
        return usuarios.get(usuario).equals(clave);
    }
}
