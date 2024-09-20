package PracticaDePatronesCreacionales.Singleton;

public class ChatPrivado {
    private static ChatPrivado instance;
    private ChatPrivado() {
    }
    public static ChatPrivado getInstance() {
        if (instance == null) {
            System.out.println("Creando chat privado");
            instance = new ChatPrivado();
        } else {
            System.out.println("Esta chat privado ya existe");
        }
        return instance;
    }
}
