package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.vehiculos.AutoClasico;
import ar.org.centro8.curso.java.vehiculos.AutoNuevo;
import ar.org.centro8.curso.java.vehiculos.Colectivo;
import ar.org.centro8.curso.java.vehiculos.Radio;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class TestVehiculos {
    public static void main(String[] args) {
        System.out.println("------ Test AutoClasico1 con radio ------");
        AutoClasico AutoClasico1 = new AutoClasico("Negro", "Ford", "Mustang");
        AutoClasico1.setRadio("Sony", 600);
        AutoClasico1.setPrecio(400000);
        System.out.println(AutoClasico1);
        

        System.out.println("------ Test AutoClasico2 sin radio ------");
        AutoClasico AutoClasico2 = new AutoClasico("Rojo", "Volkswagen", "Beetle");
        System.out.println(AutoClasico2);
        

        System.out.println("******************************************************************************************************");

        System.out.println("------ Test Colectivo1 con radio ------");
        Colectivo colectivo1 = new Colectivo("Blanco", "Chevrolet", "Vivant");

        colectivo1.setPrecio(700000);
        colectivo1.setRadio("Pioneer",700);
        System.out.println(colectivo1);

        System.out.println("--------Test Colectivo2 sin radio -----------");
        Colectivo colectivo2=new Colectivo("Rojo", "Chevrolet", "Kodiak");
        System.out.println(colectivo2);

        System.out.println("******************************************************************************************************");

        System.out.println("------ Test AutoNuevo siempre tiene radio ------");
        AutoNuevo AutoNuevo1 = new AutoNuevo("Azul", "Toyota", "Corolla");
        AutoNuevo1.setPrecio(600000);
        System.out.println(AutoNuevo1); 

        System.out.println("------ Test AutoNuevo2 se puede cambiar la radio--------");
        AutoNuevo AutoNuevo2 = new AutoNuevo("Naranja", "Tesla", "x");
        Radio radioAutoNuevo = new Radio("Sony", 666);
        AutoNuevo2.setRadio(radioAutoNuevo);
        System.out.println(AutoNuevo2);

    


    


    }
}