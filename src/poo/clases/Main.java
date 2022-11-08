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
        Coche coche3 = new Coche("Volkswagen", "Golf",4 );
        coche3.numPuertas();

        Camion camion1 = new Camion();

        // 2. Herencia, este objeto moto es de la clase Moto que es hija de la clase Vehiculo
        Moto moto = new Moto(true);
        moto.fabricante = "Kawasaki";
        moto.imprmirMoto();

        Camion volvo = new Camion("Volvo", "C60",12000.0,2021,false,100,motor,12000.0);
        volvo.imprimirCamion();

        // 3. Polimorfismo Diferenes formas
        Vehiculo vehiculox;
        vehiculox = new Camion();
        vehiculox.acelerar(120);

        vehiculox = new Moto();

        vehiculox = new Coche();

        // 4. Clases abstractas, no se pueden instanciar, solo se instancian las clases hijas

        // 5. Modificador static permite es indicar un atributo a un metodo pertenece a una clase
        // a la plantilla permite acceder a ese atributo o  metodo sin crear objetos
    }
}
