package ar.org.centro8.curso.java.vehiculos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AutoNuevo extends Vehiculo {

    private Radio radio;

    public AutoNuevo(String color, String marca, String modelo) {
        super(color, marca, modelo);

        this.radio = new Radio("RadioDeFabrica", 7000);
    }
    @Override
    public String toString() {
        return  "Vehiculo [color=" + getColor() + ", marca=" +
        getMarca() + ", modelo=" + getModelo() + ", precio=" + getPrecio()
        + ", radio=" + getRadio() + "]";
    }
    

}