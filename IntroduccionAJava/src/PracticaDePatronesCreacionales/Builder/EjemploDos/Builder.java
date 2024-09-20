package PracticaDePatronesCreacionales.Builder.EjemploDos;

public interface Builder {
    public EmailBuilder destinatarios(String destinatarios);
    public EmailBuilder asunto(String asunto);
    public EmailBuilder cuerpo(String cuerpo);
    public EmailBuilder adjuntos(String adjuntos);
}
