package PracticaDePatronesDeComportamiento.Visitor;

import java.util.ArrayList;
import java.util.List;

public class PruebaDeVisitor {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Banco("Azteca", "Jalapa", "329432", 10));
        MensajeriaParaVisitantes mensajeriaParaVisitantes = new MensajeriaParaVisitantes();
        mensajeriaParaVisitantes.enviarMensajeALosVisitantes(clientes);
    }
}
