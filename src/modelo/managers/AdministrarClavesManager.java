
package modelo.managers;

import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author alejo
 */
public class AdministrarClavesManager {
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;
    
    public int CambiarClave (int ID_ROL, String CLAVEA,String CLAVEN){
        int rowsAffect=0;
        try {
            String sql= "update CLAVES set CLAVE= ? where ID_ROL = ? and CLAVE= ?";
            acceso= con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, CLAVEN);
            ps.setObject(2, ID_ROL);
            ps.setObject(3, CLAVEA);
            rowsAffect=ps.executeUpdate();
        } catch (Exception e) {
        }
        return rowsAffect;
    }
}
