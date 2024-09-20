package PracticaDePatronesDeComportamiento.Memento.EjemploDos;

public class PruebaMemento {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Like and");
        editor.printText();
        editor.write("Like and Subscribe");
        editor.printText();
        editor.write("Like and Subscribe to Geekific!");
        editor.printText();
        editor.undo();
        editor.printText();
        //editor.undo();
        editor.redo();
        //editor.printText();
        editor.printText();
        editor.undo();
        editor.printText();
    }
}
