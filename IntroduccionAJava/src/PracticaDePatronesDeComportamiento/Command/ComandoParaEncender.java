package PracticaDePatronesDeComportamiento.Command;

public class ComandoParaEncender implements Comando{
    private Lampara lampara;

    public ComandoParaEncender(Lampara lampara) {
        this.lampara = lampara;
    }

    @Override
    public void ejecutar() {
        System.out.println(this.lampara.getNombre() + " esta haciendo lo siguiente: ");
        this.lampara.encender();
    }
}
