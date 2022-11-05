package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Moto;

public class Main {
    public static void main(String[] args) {
        // 1.  Clases y objetos
        Motor motor = new Motor("Compresion", 150, 8000d, 8);
        // Creamos un vehiculo que le llamamos coche1
        Vehiculo coche1 = new Vehiculo("Ford", "Fiesta", 5000d, 2010, true, 50, motor);
        coche1.imprimir();
        // Creamos un coche que le llamamos coche2 que hereda atributos y metodos de Vehiculo
        Coche coche2 = new Coche("Seat", "Ibiza", 5);
        coche2.numPuertas();

        Camion camion1 = new Camion();

        // 2. Herencia, este objeto moto es de la clase Moto que es hija de la clase Vehiculo
        Moto moto = new Moto(true);
        moto.fabricante = "Kawasaki";
        moto.ImprmirMoto();

        // 3. Polimorfismo

    }
}
