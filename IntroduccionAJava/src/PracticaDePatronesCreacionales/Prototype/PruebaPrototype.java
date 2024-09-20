package PracticaDePatronesCreacionales.Prototype;

public class PruebaPrototype {
    public static void main(String[] args) {
        Carro carroUno = new Carro("Honda","2001","negro", 300);
        Carro carroDos = carroUno.clonarVehiculo();
        System.out.println(carroUno);
        System.out.println(carroDos);
        carroUno.setColor("Azul");
        System.out.println(carroUno);
        System.out.println(carroDos);
    }
}
