package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Camion extends Vehiculo {
    double capacidadCarga;

    public Camion() {
    }

    public Camion(String fabricante, String modeloVehiculo, Double cc, int year, boolean sport, int velocidad, Motor motor, double capacidadCarga) {
        super(fabricante, modeloVehiculo, cc, year, sport, velocidad, motor);
        this.capacidadCarga = capacidadCarga;
    }
}
