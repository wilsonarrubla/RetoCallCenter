
package controlador;


public class Empleado {
    //Feacture
    private int id;
    private String nombre;
    private String apellido;
    private int horasExtras;
    private boolean auxilioTransporte;
    private int salario;
    private int bonoNAv;
    private String cedula;
    
    //Construc en English

   

    public Empleado(int id, String nombre, int horasExtras, boolean auxilioTransporte, int salario, int bonoNAv) {
        this.id = id;
        this.nombre = nombre;
        this.horasExtras = horasExtras;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
        this.bonoNAv = bonoNAv;
    }

    public Empleado(String nombre, String apellido, int horasExtras, boolean auxilioTransporte, int salario, int bonoNAv) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasExtras = horasExtras;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
        this.bonoNAv = bonoNAv;
    }

    public Empleado(int id, String nombre, String apellido, int horasExtras, boolean auxilioTransporte, int salario, int bonoNAv) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasExtras = horasExtras;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
        this.bonoNAv = bonoNAv;
    }

    public Empleado(int id, String cedula, String nombre, String apellido, int horasExtras, boolean auxilioTransporte, int salario, int bonoNAv) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasExtras = horasExtras;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
        this.bonoNAv = bonoNAv;
        this.cedula = cedula;
    }
    
    
    
    
    public Empleado(){
        
    }
    //getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public boolean isAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(boolean auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getBonoNAv() {
        return bonoNAv;
    }

    public void setBonoNAv(int bonoNAv) {
        this.bonoNAv = bonoNAv;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
