package PatronesDeComportamiento.State;

public class PruebaDeState {
    public static void main(String[] args) {
        Mision primeraMision = new Mision("Derrotar un Dragon");
        System.out.println(primeraMision);
        primeraMision.siguiente();
        System.out.println(primeraMision);
        primeraMision.siguiente();
        System.out.println(primeraMision);
        primeraMision.siguiente();
        System.out.println(primeraMision);
        primeraMision.siguiente();
        System.out.println(primeraMision);
        primeraMision.siguiente();
        System.out.println(primeraMision);
    }
}
