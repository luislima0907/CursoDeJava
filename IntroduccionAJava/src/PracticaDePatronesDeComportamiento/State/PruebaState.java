package PracticaDePatronesDeComportamiento.State;

public class PruebaState {
    public static void main(String[] args) {
        MaquinaDeTarjeta maquina = new MaquinaDeTarjeta();
        System.out.println(maquina);
        maquina.siguienteEstado();
        System.out.println(maquina);
        maquina.siguienteEstado();
        System.out.println(maquina);
        maquina.siguienteEstado();
        System.out.println(maquina);
        maquina.siguienteEstado();
        System.out.println(maquina);
    }
}
