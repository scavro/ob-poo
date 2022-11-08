package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Moto extends Vehiculo {
    // 1. Atributos
    boolean baul;

    // 2. Constructores
    public Moto() {
    }

    public Moto(String fabricante, String modeloVehiculo, Double cc, int year, boolean sport, int velocidad, Motor motor, boolean baul) {
        super(fabricante, modeloVehiculo, cc, year, sport, velocidad, motor);
        this.baul = baul;
    }

    public Moto(boolean baul) {
        this.baul = baul;
    }

    // 3. Metodos
    public void imprmirMoto() {
        if (baul) {
            System.out.println("La moto " + fabricante +" tiene baul");
        } else {
            System.out.println("La moto " + fabricante +" no tiene baul");
        }
    }
}
