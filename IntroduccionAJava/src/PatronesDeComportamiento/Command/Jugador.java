package PatronesDeComportamiento.Command;

public class Jugador {

    private int posicionX, posicionY, posicionZ;

    public Jugador(int posicionX, int posicionY, int posicionZ) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.posicionZ = posicionZ;
    }

    public void moverHaciaDelante(){
        posicionZ++;
        System.out.println("La posicion z: " + posicionZ);
    }

    public void moverHaciaAtras(){
        posicionZ--;
        System.out.println("La posicion z: " + posicionZ);
    }

    public void moverHaciaLaDerecha(){
        posicionX++;
        System.out.println("La posicion x: " + posicionX);
    }

    public void moverHaciaLaIzquierda(){
        posicionX--;
        System.out.println("La posicion x: " + posicionX);
    }

    public void saltar(){
        posicionY++;
        System.out.println("La posicion y: " + posicionY);
        try {
            Thread.sleep(5000);
            posicionY--;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("La posicion y: " + posicionY);
    }
}
