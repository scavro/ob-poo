package poo.clases;

import poo.herencia.Moto;

public class Main {
    public static void main(String[] args) {
        // 1.  Clases y objetos
        Motor motor = new Motor("Compresion", 150, 8000d, 8);

        Vehiculo coche = new Vehiculo("Ford", "Fiesta", 5000d, 2010, true, 50, motor);
        coche.imprimir();

        // 2. Herencia, este objeto moto es de la clase Moto que es hija de la clase Vehiculo
        Moto moto = new Moto(true);
        moto.fabricante = "Kawasaki";
        moto.ImprmirMoto();

        // 3. Polimorfismo

    }
}
