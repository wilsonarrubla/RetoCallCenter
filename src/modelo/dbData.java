
package modelo;



public class dbData {
    //Feacture
    private final String driver = "com.mysql.jdbc.Driver";
    private final String  user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/sistema_nomina";

    
    

    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
    
       
    

}
