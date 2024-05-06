package dominio.viaje.tiposViaje;

import dominio.viaje.Viaje;

public class ViajePorEspera extends Viaje {
    public Double tiempoDeEspera = 1.0;


    @Override
    public Double calcularTiempoExtra() {
        return ( this.trayectos.size() - 1) * tiempoDeEspera;
    }
}
