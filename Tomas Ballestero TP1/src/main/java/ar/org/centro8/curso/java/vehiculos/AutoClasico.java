package ar.org.centro8.curso.java.vehiculos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AutoClasico extends Vehiculo {
    
    public AutoClasico(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

}
