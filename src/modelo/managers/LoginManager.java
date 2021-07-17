
package modelo.managers;

import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import vistas.docente.frmPrincipal_docente;


public class LoginManager {
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;

    public boolean LoginUsuario(int ID_ROL ,String ID_CEDULA, String CLAVE) {
        try {  
            String sql = "select tp.NOMBRES,tp.APELLIDOS,tc.CLAVE from USUARIOS as tu " + 
            "inner join PERSONA as tp " +
            "on tu.ID_CEDULA=tp.CEDULA " + 
            "inner join CLAVES as tc " +
            "on tu.ID_ROL = tc.ID_ROL WHERE tu.ID_ROL=? and  tu.ID_CEDULA=? and tc.CLAVE=?;";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, ID_ROL);
            ps.setObject(2, ID_CEDULA);
            ps.setObject(3, CLAVE);
            rs=ps.executeQuery();
            if (rs.next()) {
               return true;          
            }else{
                JOptionPane.showMessageDialog(null,"Credenciales erroneas");
            }
          

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Función LoginUsuario: " +e.getMessage());
        }
        return false;

    }
}
