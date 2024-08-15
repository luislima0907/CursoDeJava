package PatronesDeComportamiento.Visitor;

public class PruebaVisitor {
    public static void main(String[] args) {
        Guerrero primerGuerrero = new Guerrero("Shanks");
        Mago primerMago = new Mago("Gojo");
        Asesino primerAsesino = new Asesino("Itachi");
        EnemigoVisitador enemigoVisitador = new EnemigoVisitador();
        enemigoVisitador.visitar(primerGuerrero);
        System.out.println("---------------------");
        enemigoVisitador.visitar(primerMago);
        System.out.println("---------------------");
        enemigoVisitador.visitar(primerAsesino);
    }
}
