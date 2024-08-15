package PatronesDeComportamiento.Visitor;

public class EnemigoVisitador implements Visitador{
    @Override
    public void visitar(Guerrero guerrero) {
        System.out.println("Visitando Guerrero");
        guerrero.ataqueDePoder();
    }

    @Override
    public void visitar(Mago mago) {
        System.out.println("Visitando Mago");
        mago.ataqueElemental();
    }

    @Override
    public void visitar(Asesino asesino) {
        System.out.println("Visitando Asesino");
        asesino.ataqueDeSigilo();
    }
}
