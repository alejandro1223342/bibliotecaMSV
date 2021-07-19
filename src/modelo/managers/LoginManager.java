package modelo.managers;

import Util.UsuarioSession;
import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelos.entidades.UsuarioCustomModel;
import vistas.docente.frmPrincipal_docente;

public class LoginManager {

    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;

    public boolean LoginUsuario(int ID_ROL, String ID_CEDULA, String CLAVE) throws Exception{
        UsuarioCustomModel ucm = new UsuarioCustomModel();
        boolean bandera = false;
        try {
            String sql = "select tp.NOMBRES,tp.APELLIDOS,tc.CLAVE from USUARIOS as tu "
                    + "inner join PERSONA as tp "
                    + "on tu.ID_CEDULA=tp.CEDULA "
                    + "inner join CLAVES as tc "
                    + "on tu.ID_ROL = tc.ID_ROL WHERE tu.ID_ROL=? and  tu.ID_CEDULA=? and tc.CLAVE=?;";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, ID_ROL);
            ps.setObject(2, ID_CEDULA);
            ps.setObject(3, CLAVE);
            rs = ps.executeQuery();
            
            // se envian los datos del usuario al servicio UsuarioSession
            // los datos estar´án en un singleton

            while (rs.next()) {
                bandera = true;
                ucm.setCedula(ID_CEDULA);
                ucm.setId_rol(ID_ROL);
                ucm.setNombres(rs.getString(1));
                ucm.setApellidos(rs.getString(2));
            }
            UsuarioSession.setUsuario(ucm);

            if (bandera == true) {
                return bandera;
            } else {
                throw new Exception("Credenciales erroneas");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Función LoginUsuario: " + e.getMessage());
        }

        return false;

    }
}
