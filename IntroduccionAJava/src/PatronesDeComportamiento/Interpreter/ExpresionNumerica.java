package PatronesDeComportamiento.Interpreter;

import java.util.Stack;

public class ExpresionNumerica implements Expresion{
    private int numero;

    public ExpresionNumerica(int numero) {
        this.numero = numero;
    }

    @Override
    public void interpretar(Stack<Integer> stack) {
        stack.push(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
