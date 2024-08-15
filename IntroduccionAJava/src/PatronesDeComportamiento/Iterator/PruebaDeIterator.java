package PatronesDeComportamiento.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PruebaDeIterator {
    public static void main(String[] args) {
        // ejemplo de iterator en java
        List<String> list = Arrays.asList("Hola", "mundo", "xd");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ejemplo de como hacer un stack o pila en java
        Stack<String> stack = new Stack<>();
        stack.push("Hola");
        stack.push("mundo");
        stack.push("xd");
        iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
