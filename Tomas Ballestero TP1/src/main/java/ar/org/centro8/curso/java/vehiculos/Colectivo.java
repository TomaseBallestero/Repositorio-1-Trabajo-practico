package ar.org.centro8.curso.java.vehiculos;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public final class Colectivo extends Vehiculo {

    public Colectivo(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }
}