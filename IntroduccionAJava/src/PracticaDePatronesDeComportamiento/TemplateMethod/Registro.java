package PracticaDePatronesDeComportamiento.TemplateMethod;

public abstract class Registro {

    public void guardar(){
        this.validar();
        this.antesDeGuardar();
        // guarda en base de datos
    }

    public abstract void validar();
    public abstract void antesDeGuardar();
}
