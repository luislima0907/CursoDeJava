package PatronesDeComportamiento.Observer;

public class PruebaDeObserver {
    public static void main(String[] args) {
        Guerrero primerGuerrero = new Guerrero("Kenshin");
        Guerrero segundoGuerrero = new Guerrero("Zoro");
        Mago primerMago = new Mago("Gojo");
        Mago segundoMago = new Mago("Sukuna");
        Vigilante vigilante = new Vigilante("Batman");
        vigilante.suscribe(primerGuerrero);
        vigilante.suscribe(segundoGuerrero);
        vigilante.suscribe(primerMago);
        vigilante.suscribe(segundoMago);
        vigilante.activar();
        System.out.println("----------------------");
        vigilante.desuscribirse(segundoMago);
        vigilante.activar();
    }
}
