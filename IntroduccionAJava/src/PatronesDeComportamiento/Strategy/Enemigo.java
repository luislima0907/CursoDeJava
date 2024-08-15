package PatronesDeComportamiento.Strategy;

public class Enemigo {

    private String nombre;
    private AtaqueEstrategico ataqueEstrategico;

    public Enemigo(String nombre) {
        this.nombre = nombre;
        ataqueEstrategico = new AtaqueDesconocido();
    }

    public void atacar(Jugador jugador){
        ataqueEstrategico.atacar(jugador);
//        if(tipoDeEnemigo.equals("Guerrero")){
//            System.out.println("El guerrero ataca");
//        } else if(tipoDeEnemigo.equals("Mago")){
//            System.out.println("El mago ataca");
//        } else {
//            System.out.println("ataque desconocido");
//        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AtaqueEstrategico getAtaqueEstrategico() {
        return ataqueEstrategico;
    }

    public void setAtaqueEstrategico(AtaqueEstrategico ataqueEstrategico) {
        this.ataqueEstrategico = ataqueEstrategico;
    }
}
