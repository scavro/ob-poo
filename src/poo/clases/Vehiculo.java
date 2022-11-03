package poo.clases;

public class Vehiculo {

    // 1. Atributos, las caracteristicas que tiene la clasev o propiedades
    protected String fabricante;
    protected String modelo;
    protected Double cc;               // es un tipo Wrapped, permite valores nulos
    protected int year;
    protected boolean sport;
    protected int velocidad;
    protected Motor motor;


    // 2. Constructores, funciones especiales que permiten construir los objetos desde una plantilla
    public Vehiculo() { // no hace falta rellenar sus propiedades
    }

    public Vehiculo(String fabricante, String modeloVehiculo, Double cc, int year, boolean sport, int velocidad, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modeloVehiculo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modeloVehiculo) {
        this.fabricante = fabricante;
        this.modelo = modeloVehiculo;
    }

    // 3. Metodos -- es el comportamiento
    public void acelerar(int cantidad) { // aceleramos el coche
        this.velocidad += cantidad;
    }

    public void imprimir() {
        this.fabricante = fabricante;
        this.modelo = modelo;
        if (fabricante != null && modelo != null) {
            System.out.println("El fabricante del primer coche es: " + fabricante);
            System.out.println(("Y el modelo es: " + modelo));
        } else {
            System.out.println("No has introducido ninguna informacion para generar un coche.");
        }
        System.out.println("Los centimetros cubicos del coche son: " + cc);
        System.out.println("El año del coche es: " + year);
        System.out.println("Es un coche tipo sport??: " + sport);
        System.out.println("La velocidad que alcanza es: " + velocidad);
        motor.ImprimirMotor();        //metodo de la clase motor
    }



}
