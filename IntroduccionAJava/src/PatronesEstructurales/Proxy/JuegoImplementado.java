package PatronesEstructurales.Proxy;

import java.io.*;
import java.util.Date;

public class JuegoImplementado implements Juego{
    private Estados estados;

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    @Override
    public void guardar(String nombre) {
        try {
            escribirObjeto(nombre);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Estados cargar(String nombre) {
        Estados estados = null;
        try {
            estados = (Estados)leerObjeto(nombre);
            setEstados(estados);
            return estados;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //return null;
    }

    public void nuevaPartida(String nombre) {
        File archivo = new File(nombre);
        Estados estados = new Estados(nombre, 1,0,0);
        estados.setFechaDeCreacionDeLaPartida(new Date());
        estados.setFechaDeGuardado(new Date());
        setEstados(estados);
        try {
            archivo.createNewFile();
            escribirObjeto(nombre);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void escribirObjeto(String nombre) throws IOException {
        FileOutputStream file = new FileOutputStream(nombre);
        ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(getEstados());
        obj.flush();
        obj.close();
        file.flush();
        file.close();
    }

    private Object leerObjeto(String nombre) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(nombre);
        ObjectInputStream obj = new ObjectInputStream(file);
        Object estados = obj.readObject();
        obj.close();
        file.close();
        return estados;
    }
}
