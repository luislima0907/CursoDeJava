package PatronesDeComportamiento.Mediator;

public class Enemigo implements Combate{
    private String nombre;
    //private List<Enemigo> enemigos = new ArrayList<>();
    private Mediator mediator;

    public Enemigo(String nombre, Mediator mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
        mediator.agregar(this);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando el mensaje a: " + nombre);
        mediator.enviar(this);
    }

    @Override
    public void recibir(Combate combate) {
        System.out.println("Mensaje recibido de: " + ((Enemigo) combate).getNombre() + ": " + nombre + " Modo ataque activado");
    }
//    public void agregar(Enemigo enemigo){
//        enemigos.add(enemigo);
//    }

//    public void enviar(){
//        System.out.println("Enviar mensaje a: " + nombre);
//        for(Enemigo enemigo : enemigos){
//            enemigo.recibir();
//        }
//    }
//
//    public void recibir(){
//        System.out.println(nombre + " Mensaje recibido. Modo ataque activado");
//    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre;
    }
}
