package poo.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        Empleado juanito = new Empleado("juanito", 30, 2500.0, true); // un nuevo epleado
        Empleado maria = new Empleado("maria", 35, 3000.0, true); // un nuevo epleado
        Empleado pedro = new Empleado("pedro", 35, 3000.0, true); // un nuevo epleado

        // guardar empleados
        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(maria);
        empleadoCRUD.guardar(pedro);

        // consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

        // consultar empleados
        //empleadoCRUD.imprimir(juanito);


    }


}
