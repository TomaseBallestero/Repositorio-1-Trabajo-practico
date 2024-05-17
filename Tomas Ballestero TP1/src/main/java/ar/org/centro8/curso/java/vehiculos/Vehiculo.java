package ar.org.centro8.curso.java.vehiculos;


import lombok.Setter;
import lombok.Getter;
@Getter
@Setter
public abstract class Vehiculo {

    private String color;
    private String marca;
    private String modelo;
    private double precio;
    private Radio radio;

    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void agregarRadio(Radio radio){
        this.radio=radio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setRadio(String marcaRadio,
            int potenciaRadio) {
        this.radio = new Radio(marcaRadio, potenciaRadio);
    }

   

    @Override
    public String toString() {
        return "Vehiculo [color=" + color + ", marca=" +
                marca + ", modelo=" + modelo + ", precio=" + precio
                + ", radio=" + radio + "]";
    }

}
    


