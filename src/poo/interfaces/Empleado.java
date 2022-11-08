package poo.interfaces;

public class Empleado {

    //1 . Atributos
    String nombre;
    int edad;
    double salario;
    boolean dadoDeAlta;

    // 2. Constructores
    public Empleado(){}

    public Empleado(String nombre, int edad, double salario, boolean dadoDeAlta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.dadoDeAlta = dadoDeAlta;
    }

    // 3. Metodos
    public void imprimirEmpleado(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("El salario es: " + salario);
        if(dadoDeAlta){
            System.out.println("Esta dado de alta");
        } else
            System.out.println("No esta dado de alta");
    }
    @Override
    public String toString() { // para que nos muestre los datos de los atributos cuando lo imprimmos en consola
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", dadoDeAlta=" + dadoDeAlta +
                '}';
    }
}
