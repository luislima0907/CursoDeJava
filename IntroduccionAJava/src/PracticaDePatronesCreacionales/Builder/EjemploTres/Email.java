package PracticaDePatronesCreacionales.Builder.EjemploTres;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private List<String> destinatarios = new ArrayList<>();
    private String asunto;
    private String cuerpo;
    private List<File> adjuntos = new ArrayList<>();

    public Email() {
    }

    private Email(EmailBuilder builder) {
        this.destinatarios = builder.email.destinatarios;
        this.asunto = builder.email.asunto;
        this.cuerpo = builder.email.cuerpo;
    }

    @Override
    public String toString() {
        return "Email{" +
                "destinatarios=" + destinatarios +
                ", asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                '}';
    }

    public static class EmailBuilder implements Builder{
        private Email email = new Email();

        public EmailBuilder setDestinario(String destinatario){
            this.email.destinatarios.add(destinatario);
            return this;
        }

        public EmailBuilder setAsunto(String asunto){
            this.email.asunto = asunto;
            return this;
        }
        public EmailBuilder setCuerpo(String cuerpo){
            this.email.cuerpo = cuerpo;
            return this;
        }

        public EmailBuilder setAdjuntos(File adjunto){
            this.email.adjuntos.add(adjunto);
            return this;
        }

        @Override
        public Email build() {
            if (email.destinatarios.isEmpty()){
                throw new RuntimeException("Un correo no puede ir sin destinatario");
            }


            return new Email(this);
        }
    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

}
