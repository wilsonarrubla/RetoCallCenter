
package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class CallCenter {
    //Feactures
    //CallCenter relación agregació 1..* Empleados
    private ArrayList<Empleado> empleado = new  ArrayList<>();
    
    //Constructor por default
    
    //Getters and Setters

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }
    
    //Lógica del negocio
    /* Este método se utiliza para liquidar la nómina de una lista de empleados en
    un Arraylist
 
    */
   public ArrayList<Double> liquidarNominaEmp(ArrayList<Empleado> empleados){
       ArrayList<Double> nominas = new ArrayList<>();
       if(empleados==null){
           return null;
       }else{
           for (Empleado empleado:empleados) {
              double neto = 0;
               
              double valorHoraExtra = empleado.getHorasExtras();
              double salario = empleado.getSalario();
              boolean auxTran = empleado.isAuxilioTransporte();
              
              double aporte = (salario + valorHoraExtra)*0.08;
              
              if (auxTran){
                  neto = (salario +valorHoraExtra + 106454) - aporte;
              }else{
                  neto = (salario +valorHoraExtra) - aporte;
              }                  
              nominas.add(neto);   
               
           }
       }         
              
       return nominas;
       }
   /*Sobrecarga de método para liquidarnóminaEmp de un solo empleado
   Y utilizar el metodo Convertir que nos permite formatear la salida String para que no 
   salga la notación científica para ello se hace necesario una clase que retorne aqui hacemos mod*/
   
     public Double liquidarNominaEmp(Empleado empleado){
       Double nominas ;
      
       if(empleado==null){
           return null;
       }else{
           
              double neto = 0;
               
              double valorHoraExtra = empleado.getHorasExtras();
              double salario = empleado.getSalario();
              boolean auxTran = empleado.isAuxilioTransporte();
              
              double aporte = (salario + valorHoraExtra)*0.08;
              
              if (auxTran){
                  neto = (salario +valorHoraExtra + 106454) - aporte;
              }else{
                  neto = Math.round((salario +valorHoraExtra) - aporte);
              }                  
              nominas= (neto);                
           }
              
              
       return nominas;
       }
   /* Sobrecarga de metodo */
   
   
   //Calculo de las prestaciones sociales
   public ArrayList<Double> liquidarPrestacionesEmp(ArrayList<Empleado> empleados){
    
       ArrayList<Double> prestaciones = new ArrayList<>();
        if(empleado==null){
           return null;
        } else{
            for (Empleado empleado:empleados) {
                int vlrAuxTrans = 106454;
                double vlrPrestaciones, primas, cesantias, intCesantias, vacaciones ;
                double valorHoraExtra = empleado.getHorasExtras();
                double salario = empleado.getSalario();
                boolean auxTran = empleado.isAuxilioTransporte();
                
                //Calcular las prestaciones
                if (auxTran){
                  primas = (valorHoraExtra + vlrAuxTrans + salario)*0.0833;
                  cesantias = (valorHoraExtra + vlrAuxTrans + salario)*0.0833;
                  intCesantias = (cesantias*0.12);
                  vacaciones = (salario * 0.0416);
                  
                }else{
                  primas = (valorHoraExtra + salario)*0.0833;
                  cesantias = (valorHoraExtra + salario)*0.0833;
                  intCesantias = (cesantias*0.12);
                  vacaciones = (salario * 0.0416);
                }                  
                
                vlrPrestaciones = Math.round(primas + cesantias + intCesantias + vacaciones);
                prestaciones.add(vlrPrestaciones);
            }
        }
           
           
       return prestaciones;
   }
   
   /*Sobrecarga de método para liquidarPrestacionesEmp de un solo empleado*/
    public Double liquidarPrestacionesEmp(Empleado empleado){
    
       Double prestaciones ;
        if(empleado==null){
           return null;
        } else{
            
                int vlrAuxTrans = 106454;
                double vlrPrestaciones, primas, cesantias, intCesantias, vacaciones ;
                double valorHoraExtra = empleado.getHorasExtras();
                double salario = empleado.getSalario();
                boolean auxTran = empleado.isAuxilioTransporte();
                
                //Calcular las prestaciones
                if (auxTran){
                  primas = (valorHoraExtra + vlrAuxTrans + salario)*0.0833;
                  cesantias = (valorHoraExtra + vlrAuxTrans + salario)*0.0833;
                  intCesantias = (cesantias*0.12);
                  vacaciones = (salario * 0.0416);
                  
                }else{
                  primas = (valorHoraExtra + salario)*0.0833;
                  cesantias = (valorHoraExtra + salario)*0.0833;
                  intCesantias = (cesantias*0.12);
                  vacaciones = (salario * 0.0416);
                }                  
                
                vlrPrestaciones = Math.round(primas + cesantias + intCesantias + vacaciones);
                prestaciones=(vlrPrestaciones);
        } 
        
    
       return prestaciones;
   }
   
    public HashMap<Integer, ArrayList> procesoMasivoNominaPrestaciones(LinkedList<Empleado> empleadoLista){
        HashMap<Integer, ArrayList> ListaNominas = new HashMap<Integer, ArrayList>();
                
        if(empleadoLista != null){
            
            for (Empleado empleado : empleadoLista) {
                
                ArrayList LiqEmpleado = new ArrayList<>();
                
                Double nomina  ;
                Double prestacion ;
                
                int  id = empleado.getId();
                String nombre = empleado.getNombre() + " " + empleado.getApellido();

                nomina = liquidarNominaEmp(empleado);
                prestacion = liquidarPrestacionesEmp(empleado);

                LiqEmpleado.add(id);
                LiqEmpleado.add(nombre);
                LiqEmpleado.add(Math.round(nomina));
                LiqEmpleado.add(Math.round(prestacion));
                // Lista { id : (id - nombre empleado + apellido + nomina + prestacion) }
                ListaNominas.put(id, LiqEmpleado);
            
            }
            
        }else{
            return null;
        }
        
        return ListaNominas;
        
    }
        
        

}
