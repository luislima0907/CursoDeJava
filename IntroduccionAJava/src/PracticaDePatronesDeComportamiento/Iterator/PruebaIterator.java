package PracticaDePatronesDeComportamiento.Iterator;

import java.util.List;

public class PruebaIterator {
    public static void main(String[] args) {
        Vertice<Integer> verticeCero = new Vertice<>(0);
        Vertice<Integer> verticeUno = new Vertice<>(1);
        Vertice<Integer> verticeDos = new Vertice<>(2);
        Vertice<Integer> verticeTres = new Vertice<>(3);
        Vertice<Integer> verticeCuatro = new Vertice<>(4);
        Vertice<Integer> verticeCinco = new Vertice<>(5);
        Vertice<Integer> verticeSeis = new Vertice<>(6);

        verticeCero.setVertices(List.of(verticeUno, verticeCinco, verticeSeis));
        verticeUno.setVertices(List.of(verticeTres, verticeCuatro, verticeCinco));
        verticeCuatro.setVertices(List.of(verticeDos, verticeSeis));
        verticeSeis.setVertices(List.of(verticeCero));

        IteratorProfundo iteratorProfundo = new IteratorProfundo(verticeCero);
        while(iteratorProfundo.hasNext()) {
            System.out.println(iteratorProfundo.getNext().toString());
        }

    }
}
