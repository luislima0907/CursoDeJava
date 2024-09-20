package PracticaDePatronesCreacionales.Builder.EjemploDos;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private List<String> destinatarios = new ArrayList<>();
    private String asunto;
    private String cuerpo;
    private List<String> adjuntos = new ArrayList<>();

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<String> destinatarios) {
        if (this.destinatarios == null || this.destinatarios.isEmpty()){
            throw new IllegalArgumentException("El destinatario no puede estar vacio");
        }
        this.destinatarios = destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        if (asunto == null || asunto.isEmpty()) {
            throw new IllegalArgumentException("El asunto no puede ser nulo");
        }
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        if (cuerpo == null || cuerpo.isEmpty()){
            throw new IllegalArgumentException("El cuerpo no puede ser nulo");
        }
        this.cuerpo = cuerpo;
    }

    public List<String> getAdjuntos() {
        return adjuntos;
    }

    public void setAdjuntos(List<String> adjuntos) {
        if (adjuntos == null || adjuntos.isEmpty()){
            adjuntos.add("Sin archivos adjuntos");
        }
        this.adjuntos = adjuntos;
    }

    public static EmailBuilder builder() {
        return new EmailBuilder();
    }

    @Override
    public String toString() {
        return "EMAIL" +
                "\nDestinatarios: " + destinatarios +
                "\nAsunto: '" + asunto + '\'' +
                "\nCuerpo: '" + cuerpo + '\'' +
                "\nAdjuntos: " + adjuntos;
    }
}
