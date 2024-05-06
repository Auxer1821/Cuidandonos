package dominio.usuario.alerta;

public class Esperar implements Alerta{


    @java.lang.Override
    public boolean alertar(InfoAlerta unaInfoAlerta) {
        return true;
    }
}
