package Util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexion {

    Connection con;

    String url = "jdbc:mysql://localhost:3306/actividades_economicas";
    String user = "root";//root    
    String pass = "";//sin clave

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
        }
        return con;
    }

    
}
