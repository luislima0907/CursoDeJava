package PatronesEstructurales.Proxy;

import java.util.Date;

public class ProxyJuegoImplementado implements Juego{
    private Estados estados;
    private JuegoImplementado juegoImplementado;

    public ProxyJuegoImplementado(JuegoImplementado juegoImplementado) {
        this.juegoImplementado = juegoImplementado;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    public JuegoImplementado getJuegoImplementado() {
        return juegoImplementado;
    }

    public void setJuegoImplementado(JuegoImplementado juegoImplementado) {
        this.juegoImplementado = juegoImplementado;
    }

    @Override
    public void guardar(String nombre) {
        estados.setFechaDeGuardado(new Date());
        juegoImplementado.setEstados(estados);
        juegoImplementado.guardar(nombre);
    }

    @Override
    public Estados cargar(String nombre) {
        Estados estados1 = juegoImplementado.cargar(nombre);
        setEstados(estados1);
        return estados1;
    }
}
