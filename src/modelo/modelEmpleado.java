
package modelo;

import java.sql.*;
import controlador.Empleado;
import java.util.LinkedList;

public class modelEmpleado extends dbData {
    
    //Metodo logica
    public void mostrarDatos(int empId, String cedula, String nombre,String apellido, int vlrHoraExtra, String auxTra, int salario, int bonificacion ){
      System.out.println("ID Empleado: " + empId +
                                    "\nCedula: " + cedula+
                                    "\nNombre: " + nombre+
                                    "\nApellido: " + apellido+
                                    "\nHoras extras: " + vlrHoraExtra +
                                    "\nAuxili de transporte: " + auxTra +
                                    "\nSalario: " + salario +
                                    "\nBonificación :" +bonificacion);
      System.out.println("");
                  
    }
    
    public Empleado  validarCedula(String cedula){
        Empleado emp =null;
        
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String query = "SELECT * FROM `tb_empleado` WHERE cedula = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, cedula);
            ResultSet resul = stmt.executeQuery();
            
            while(resul.next()){
                
                int empId = resul.getInt(1);
                String nombre = resul.getString(2);
                int vlrHoraExtra = resul.getInt(3);
                String auxTransp = resul.getString(4);
                int salarioEmpl = resul.getInt(5);
                int bonificacion = resul.getInt(6);
                String apellido = resul.getString(7);
                String cedul = resul.getString(8);
                
                mostrarDatos(empId,cedul, nombre,apellido,vlrHoraExtra,auxTransp,salarioEmpl,bonificacion);
                               
                switch (auxTransp) {
                   
                case "true" -> emp =new Empleado(empId,nombre, apellido, vlrHoraExtra, true, salarioEmpl, bonificacion);
                case "false" -> emp =new Empleado(empId,nombre, apellido, vlrHoraExtra, false, salarioEmpl, bonificacion);
                default -> throw new AssertionError();
                 }
                
            }
                
            stmt.close();
            resul.close(); 
            return emp;
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return emp;
        
    }
    
    public Empleado consultaEmpleadoId(String id){
        Empleado emp =null;
        
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String query = "SELECT * FROM `tb_empleado` WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, id);
            ResultSet resul = stmt.executeQuery();
            while(resul.next()){
                
                int empId = resul.getInt(1);
                String nombre = resul.getString(2);
                int vlrHoraExtra = resul.getInt(3);
                String auxTransp = resul.getString(4);
                int salarioEmpl = resul.getInt(5);
                int bonificacion = resul.getInt(6);
                String apellido = resul.getString(7); 
                String cedula = resul.getString(8);
                
                mostrarDatos(empId,cedula, nombre,apellido,vlrHoraExtra,auxTransp,salarioEmpl,bonificacion);
                               
                switch (auxTransp) {
                   
                case "true" -> emp =new Empleado(empId, cedula, nombre, apellido, vlrHoraExtra, true, salarioEmpl, bonificacion);
                case "false" -> emp =new Empleado(empId, cedula, nombre, apellido, vlrHoraExtra, false, salarioEmpl, bonificacion);
                default -> throw new AssertionError();
            }
                
            }
                
            return emp;
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return emp;
        
       
    }
    /*Método para crear un empleado con consulta sql preparada*/
    public boolean agregarEmpleadoBd(String nombre, String apellido,  int vlrHoraExtra, boolean auxTra, int salario, int bonoNav, String cedula){
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String sqlInsert = "INSERT INTO `tb_empleado`(`nombre`, `hora_extra`, `aux_transp`, `salario`, `bono_diciembre`,Apellido,cedula) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sqlInsert);
            stmt.setString(1, nombre);
            
            stmt.setInt(2, vlrHoraExtra);
            
           if (auxTra==true){
               stmt.setString(3,"true");
           }else{
               stmt.setString(3,"false");
           }            
            stmt.setInt(4, salario); 
            stmt.setInt(5, bonoNav); 
            stmt.setString(6, apellido);
            stmt.setString(7, cedula);
            int resul=stmt.executeUpdate();
            if(resul>0){
                System.out.println("Se agrego exitosamente el registro");                        
            }else{
                
                System.out.println("No se ha guardado la información");
            }
            stmt.close();
            return true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            
            }
        return false;
    }
    
    /*Mètodo para editar empleados con cosnultas preparadas*/
    public boolean editEmpleado (int id, String cedula, String nombre, String apellido, int horasExtras, boolean auxilioTransporte, int salario, int bonoNAv){
         
        try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String sqlEdit = "UPDATE `tb_empleado` SET `nombre`=?,`hora_extra`=?,`aux_transp`=?,`salario`=?,`bono_diciembre`=?,`Apellido`=?, cedula =? WHERE `id`=?;";
              
            //String sqlInsert = "INSERT INTO `tb_empleado`(`nombre`, `hora_extra`, `aux_transp`, `salario`, `bono_diciembre`,Apellido) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sqlEdit);
            stmt.setString(1, nombre);
            
            stmt.setInt(2, horasExtras);
            
           if (auxilioTransporte==true){
               stmt.setString(3,"true");
           }else{
               stmt.setString(3,"false");
           }            
            stmt.setInt(4, salario); 
            stmt.setInt(5, bonoNAv); 
            stmt.setString(6, apellido);
            stmt.setInt(8, id); 
            stmt.setString(7, cedula);
            int resul=stmt.executeUpdate();
            if(resul>0){
                System.out.println("Se agrego exitosamente el registro");                        
            }else{
                
                System.out.println("No se ha guardado la información");
            }
            stmt.close();
            return true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            
            }
        return false;
    }
    
    public boolean eliminarEmpleado(String id){
        Empleado  empleado = consultaEmpleadoId(id);
        if(empleado != null){
            try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
              String sqldelet = "DELETE FROM `tb_empleado` WHERE `id`=?";
              
            
                PreparedStatement stmt = connection.prepareStatement(sqldelet);
                stmt.setString(1, id);
                stmt.executeUpdate();
                stmt.close();

                return true;
                
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                
            }
        
        
        }else{
            return false;
        }
       return false;
    }
    
    public LinkedList<Empleado> listaEmpleado(){
       LinkedList<Empleado> empleadoLista = new LinkedList<>();
       Empleado empleado = null;
        
        
         try (Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String query = "SELECT id, nombre, Apellido, hora_extra, aux_transp, salario, bono_diciembre, cedula FROM `tb_empleado`";
            Statement stmt = connection.createStatement();
            ResultSet resul = stmt.executeQuery(query);
            
            while(resul.next()){
                
                int empId = resul.getInt(1);
                String nombre = resul.getString(2);
                String apellido = resul.getString(3); 
                int vlrHoraExtra = resul.getInt(4);
                String auxTransp = resul.getString(5);
                int salarioEmpl = resul.getInt(6);
                int bonificacion = resul.getInt(7);
                String cedula = resul.getString(8);        
                mostrarDatos(empId,cedula, nombre,apellido,vlrHoraExtra,auxTransp,salarioEmpl,bonificacion);
                               
                switch (auxTransp) {
                   
                case "true" -> empleado =new Empleado(empId, cedula, nombre, apellido, vlrHoraExtra, true, salarioEmpl, bonificacion);
                case "false" -> empleado =new Empleado(empId, cedula, nombre, apellido, vlrHoraExtra, false, salarioEmpl, bonificacion);
                default -> throw new AssertionError();
            }
             empleadoLista.add(empleado);
             
            }
            stmt.close();
            resul.close();   
            return empleadoLista;
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return empleadoLista;
    }
}
    

