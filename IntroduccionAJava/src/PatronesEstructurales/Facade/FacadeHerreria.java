package PatronesEstructurales.Facade;

public class FacadeHerreria {
    public void trabajo(String nombre, boolean crear) {
        if (crear) {
            Forja forja = new Forja();
            forja.trabajar(nombre);
            if(Recetas.getReceta(nombre, crear)){
                if(!forja.buscar(nombre)){
                    return;
                }
                forja.remover(nombre);
                forja.trabajando(nombre);
                System.out.println("El/la " + nombre + "ha sido creado");
            } else {
                System.out.println("No ha sido posible " + Forja.ACCION + " el/la " + nombre);
            }
        } else {
            BancoDeTrabajo bancoDeTrabajo = new BancoDeTrabajo();
            bancoDeTrabajo.trabajar(nombre);
            if(Recetas.getReceta(nombre, crear)){
                if(!bancoDeTrabajo.buscar(nombre)){
                    return;
                }
                bancoDeTrabajo.remover(nombre);
                bancoDeTrabajo.trabajando(nombre);
                System.out.println("El/la " + nombre + "ha sido mejorado");
            } else {
                System.out.println("No ha sido posible " + Forja.ACCION + " el/la " + nombre);
            }
        }
    }
}
