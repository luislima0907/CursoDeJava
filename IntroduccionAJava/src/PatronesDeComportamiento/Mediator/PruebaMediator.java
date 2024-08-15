package PatronesDeComportamiento.Mediator;

public class PruebaMediator {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Enemigo enemigoUno = new Enemigo("Alien", mediator);
        Enemigo enemigoDos = new Enemigo("Flood", mediator);
        Enemigo enemigoTres = new Enemigo("Didacta", mediator);
        Compa compa = new Compa("compa", mediator);
        enemigoUno.enviar();

//        Enemigo enemigoUno = new Enemigo("Alien");
//        Enemigo enemigoDos = new Enemigo("Flood");
//        Enemigo enemigoTres = new Enemigo("Didacta");
//        enemigoUno.agregar(enemigoDos);
//        enemigoUno.agregar(enemigoTres);
//        enemigoDos.agregar(enemigoUno);
//        enemigoTres.agregar(enemigoUno);
//        enemigoDos.agregar(enemigoTres);
//        enemigoTres.agregar(enemigoDos);
//        enemigoUno.enviar();
    }
}
