package PracticaDePatronesDeComportamiento.Visitor;

import java.util.List;

public class MensajeriaParaVisitantes implements Visitor {

    public void enviarMensajeALosVisitantes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            cliente.aceptar(this);
        }
    }

    @Override
    public void visitar(Banco banco) {
        System.out.println("Enviando mensajes sobre los seguros para bancos a " + banco.getNombre());
    }

    @Override
    public void visitar(Empresa empresa) {
        System.out.println("Enviando empleados y equipo para la empresa " + empresa.getNombre());
    }

    @Override
    public void visitar(Residente residente) {
        System.out.println("Enviando mensajes sobre seguros medicos a " + residente.getNombre());
    }

    @Override
    public void visitar(Restaurante restaurante) {
        System.out.println("Enviando comida y gas hacia " + restaurante.getNombre());
    }
}
