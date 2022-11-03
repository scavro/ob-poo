package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Coche extends Vehiculo {

    // 1. Atributos
    int numeroPuertas;

    // 2. Constructores

    public Coche() {
    }

    public Coche(String fabricante, String modeloVehiculo, Double cc, int year, boolean sport, int velocidad, Motor motor, int numeroPuertas) {
        super(fabricante, modeloVehiculo, cc, year, sport, velocidad, motor);
        this.numeroPuertas = numeroPuertas;
    }

    public Coche(String fabricante, String modeloVehiculo, int numeroPuertas) {
        super(fabricante, modeloVehiculo);
        this.numeroPuertas = numeroPuertas;
    }

    // 3. Metodos

}
