package poo.clases;

public class Motor {

    // 1. atributos
    String modelo;
    int caballos;
    double parNm;
    int numCilindros;

    // 2. constructores
    public Motor() {
    }

    public Motor(String modelo, int caballos, double parNm, int numCilindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }

    // 3. metodos
    public void ImprimirMotor() {
        System.out.println("El modelo del motor es: " + modelo);
        System.out.println("El numero de caballos del motor son: " + caballos);
        System.out.println("El par Motor es: " + parNm);
        System.out.println("El numero de cilindros son: " + numCilindros);
    }
}
