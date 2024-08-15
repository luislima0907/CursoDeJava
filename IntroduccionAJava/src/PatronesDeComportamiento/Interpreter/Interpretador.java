package PatronesDeComportamiento.Interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Interpretador {
    private List<Expresion> listaExpresiones = new ArrayList<>();

    public Interpretador(String expresion) {
        for(String token : expresion.split(" ")) {
            if(token.equals("+")){
                listaExpresiones.add(new ExpresionSumar());
            } else if(token.equals("-")){
                listaExpresiones.add(new ExpresionRestar());
            } else if(token.equals("*")){
                listaExpresiones.add(new ExpresionMultiplicar());
            } else if(token.equals("/")){
                listaExpresiones.add(new ExpresionDividir());
            } else {
                listaExpresiones.add(new ExpresionNumerica(Integer.valueOf(token)));
            }
        }
    }

    public int evaluar(){
        Stack<Integer> stack = new Stack<>();
        for(Expresion exp : listaExpresiones) {
            exp.interpretar(stack);
        }
        return stack.pop();
    }
}
