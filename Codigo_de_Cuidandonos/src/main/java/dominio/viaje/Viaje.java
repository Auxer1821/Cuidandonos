package dominio.viaje;

import java.time.LocalDateTime;

public abstract class Viaje {

    //atributos
    protected Integer idViaje;
    protected List<Trayecto> trayectos;
    protected Usuario transeunte;
    protected List<Usuario> cuidadores;
    protected LocalDateTime fechaInicio ;
    protected LocalDateTime getFechaFinal;


    //metodos
    public Double calcularTiempoTotal(){
        return this.calcularTiempoViaje() + this.calcularTiempoExtra();
    }

    public abstract Double calcularTiempoExtra();

    public Double calcularTiempoViaje() {
        return this.trayectos.stream().mapToDouble(Trayecto::tiempoEstimado).sum();
    }

}
