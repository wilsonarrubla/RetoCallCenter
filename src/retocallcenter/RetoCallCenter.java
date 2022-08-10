
package retocallcenter;

import controlador.CallCenter;
import controlador.Empleado;
import java.util.ArrayList;
import modelo.modelEmpleado;

public class RetoCallCenter {

   
    public static void main(String[] args) {
        // TODO code application logic here
        CallCenter liquidacion = new CallCenter();
        ArrayList<Double> nominas = new  ArrayList<>();
        ArrayList<Double> prestaciones = new  ArrayList<>();
        ArrayList<Empleado> listaEmpleado = new  ArrayList<>();
        
        //Instancia Empleados --null
        Empleado empleado0 = new Empleado();
        listaEmpleado.add(empleado0);
        //Instancias Empleados 
        Empleado empleado1 = new Empleado(1, "1102822", "pablo", "mendez", 50000, true, 600000, 1500000);
        listaEmpleado.add(empleado1);
        Empleado empleado2 = new Empleado(1, "1102823", "Andres", "paz", 50000, true, 600000, 1500000);
        listaEmpleado.add(empleado2);
        Empleado empleado3 = new Empleado(1, "1102823", "Maria", "Jimenez", 50000, true, 600000, 1500000);
        listaEmpleado.add(empleado3);
        
        //Hacemos una consulta en la BD de mysql 
        modelEmpleado empleado4 =new modelEmpleado();
        if (empleado4 !=null){
            listaEmpleado.add(empleado4.consultaEmpleadoId("2"));
        }
            //Vamos a insertar un empleado a la base de datos en mysql
        
        //modelEmpleado empleado5 =new modelEmpleado();
        //empleado5.agregarEmpleadoBd("Yasmin", 120000, true, 6500000, 150000);
        //empleado5.agregarEmpleadoBd("Jhonatan", "Mathieu", 5000, true, 5555, 5555);
        
        
        System.out.println("Liquidación de nómina");
        nominas = liquidacion.liquidarNominaEmp(listaEmpleado);
        for (int i = 0; i < nominas.size(); i++) {
            System.out.println("Nombre: "+ listaEmpleado.get(i).getNombre() + " Total a Pagar: " + Math.round( nominas.get(i)));
            
        }
        prestaciones = liquidacion.liquidarPrestacionesEmp(listaEmpleado);
        for (int i = 0; i < prestaciones.size(); i++) {
            System.out.println("Nombre: " + listaEmpleado.get(i).getNombre() + " Total a Pagar: "+ Math.round(prestaciones.get(i)));
        }
    }
    
}
