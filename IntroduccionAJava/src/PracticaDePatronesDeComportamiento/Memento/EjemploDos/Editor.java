package PracticaDePatronesDeComportamiento.Memento.EjemploDos;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {
    private final TextArea textArea;
    private final Deque<TextArea.Memento> stateHistory;
    private int indice;

    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<>();
        indice = 0;
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.offer(textArea.takeSnapshot());
    }

    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        stateHistory.pollLast();
        textArea.restore(stateHistory.peekLast());
    }

    public void redo(){
        if (stateHistory.isEmpty()) {
            System.out.println("No hay mementos");
        }
        TextArea.Memento memento = stateHistory.getLast();
    }

    public void printText() {
        System.out.println(textArea.getText());
    }
}
