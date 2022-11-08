package poo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    // 1. Atributos --- estructura de datos
    private List<Empleado> empleados = new ArrayList<>();  //creamos un array list com si fuese un objeto, no seria
                           // accesible desde fuera, por eso es private, para q nadie lo pueda modificar desde fuera

    // 2. Constructores
    public EmpleadoCRUD(){}
    public EmpleadoCRUD (List<Empleado> empleados){
    this.empleados = empleados;
    }

    // 3. Metodos --- operaciones CRUD
    public void guardar(Empleado empleado){  // CREATE empleado
        empleados.add(empleado); //guardamos un empleado que es un objeto
    }
    // buscar empleados retrieve recuperar
    public List<Empleado> findAll(){
        return empleados;
    }
    public void imprimir(Empleado empleado){
        System.out.println("El nombre es: " + empleado.nombre);
        System.out.println("La edad es: " + empleado.edad);
        System.out.println("El salario es: " + empleado.salario);
        if(empleado.dadoDeAlta){
            System.out.println("Esta dado de alta");
        } else
            System.out.println("No esta dado de alta");


    }



}
