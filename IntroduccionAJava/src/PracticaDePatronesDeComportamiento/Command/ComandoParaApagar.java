package PracticaDePatronesDeComportamiento.Command;

public class ComandoParaApagar implements Comando{
    private Lampara lampara;

    public ComandoParaApagar(Lampara lampara) {
        this.lampara = lampara;
    }

    @Override
    public void ejecutar() {
        System.out.println(this.lampara.getNombre() + " esta haciendo lo siguiente: ");
        this.lampara.apagar();
    }
}
