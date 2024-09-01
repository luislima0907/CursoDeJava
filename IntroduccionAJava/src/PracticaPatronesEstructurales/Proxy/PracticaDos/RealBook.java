package PracticaPatronesEstructurales.Proxy.PracticaDos;

public class RealBook implements Book{
    private String title;

    public RealBook(String title) {
        this.title = title;
        loadFromDisk();
    }

    public void loadFromDisk(){
        System.out.println("Cargando libro: " + title);
    }

    @Override
    public void display() {
        System.out.println("Mostrando libro: " + title);
    }
}
