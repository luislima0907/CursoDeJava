package PatronesCreacionales.PatronPrototype;

public class PruebaDePrototype {
    public static void main(String[] args) {
        // esta es la forma de usar el patron Prototype
        // el objetivo de Prototype es hacer una copia de un mismo objeto
        // y que ese objeto sea independiente cuando se copie, para que no
        // dependa del objeto original a la hora de modificarse un atributo
        Guerrero guerrero1 = new Guerrero(100, 50, 150);
        Guerrero guerrero2 = (Guerrero)guerrero1.Clonar();
        System.out.println(guerrero1);
        System.out.println(guerrero2);
        System.out.println("------------");
        guerrero2.setSalud(0);
        System.out.println(guerrero1);
        System.out.println(guerrero2);
        System.out.println("------------");
        Mago mago1 = new Mago(200, 50, 150);
        Mago mago2 = (Mago)mago1.Clonar();
        System.out.println(mago1);
        System.out.println(mago2);
        System.out.println("------------");
        mago2.setSalud(0);
        System.out.println(mago1);
        System.out.println(mago2);

        // esta es una forma de copiar un objeto pero no es la ideal
        // cuando tenemos al patron Prototype

//        Enemigo enemigo1 = new Enemigo(100, 150);
//        Enemigo enemigo2 = enemigo1.Clonar();
//        Enemigo enemigo2 = new Enemigo(enemigo1.getSalud(), enemigo1.getDanio());
//        enemigo2.setSalud(enemigo1.getSalud());
//        enemigo2.setDanio(enemigo1.getDanio());
//        Enemigo enemigo3 = enemigo1;
//
//        System.out.println(enemigo1);
//        System.out.println(enemigo2);
//        System.out.println(enemigo3);
//        System.out.println("---------");
//
//        enemigo2.setSalud(0);
//        System.out.println(enemigo1);
//        System.out.println(enemigo2);
//        System.out.println(enemigo3);
    }
}
