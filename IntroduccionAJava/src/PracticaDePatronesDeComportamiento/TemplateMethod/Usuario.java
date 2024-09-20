package PracticaDePatronesDeComportamiento.TemplateMethod;

import java.util.Objects;

public class Usuario extends Registro{
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void validar() {
        if(!Objects.equals(this.nombre, "Luis")){
            System.out.println("Este usuario no puede guardar en db");
        } else {
            System.out.println("Permiso concedido para " + getNombre());
        }
    }

    @Override
    public void antesDeGuardar() {
        System.out.println("Guardado en db");
    }
}
