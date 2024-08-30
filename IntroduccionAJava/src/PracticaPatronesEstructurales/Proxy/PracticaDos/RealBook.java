package PracticaPatronesEstructurales.Proxy.PracticaDos;

public class RealBook implements Book{
    private String title;

    // al momento de instanciar o referenciar el objeto real, nos tomara mas recursos
    // que si lo hacemos mediante el representante del proxy, porque el proxy solo
    // actuara solo si nosotros le indicamos que queremos ver el libro, entonces ahi
    // proxy ya crea la referencia al objeto real y a su vez lo muestra con el metodo display
    public RealBook(String title) {
        this.title = title;
        loadFromDisk();
    }

    // este metodo representa una tarea costosa al momento de crear la instancia del libro
    public void loadFromDisk(){
        System.out.println("Cargando libro: " + title);
    }

    @Override
    public void display() {
        System.out.println("Mostrando libro: " + title);
    }
}
