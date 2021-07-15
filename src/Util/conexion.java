package Util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexion {

    Connection con;

    String url = "jdbc:mysql://mysql-38431-0.cloudclusters.net:38431/biblioteca";
    String user = "admin";//root    
    String pass = "rO6DjTXY";//sin clave

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
        }
        return con;
    }

    
}
