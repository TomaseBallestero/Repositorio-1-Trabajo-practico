package ar.org.centro8.curso.java.vehiculos;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Radio {

    private String marca;
    private int potencia;

    public Radio(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Radio(" +
                "marca='" + marca + '\'' +
                ", potencia=" + potencia +
                ')';
    }
}

    

