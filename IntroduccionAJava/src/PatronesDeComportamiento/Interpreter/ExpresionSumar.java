package PatronesDeComportamiento.Interpreter;

import java.util.Stack;

public class ExpresionSumar implements Expresion{

    @Override
    public void interpretar(Stack<Integer> stack) {
        int auxiliar = stack.pop();
        stack.push(stack.pop() + auxiliar);
    }
}
