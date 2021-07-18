package modelo.managers;

import Util.conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.entidades.UsuarioCustomModel;

public class GestorDocenteManager {

    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;

    public ArrayList<UsuarioCustomModel> FindAllDocentes(boolean estado) {
        
        ArrayList<UsuarioCustomModel> listaDocente = new ArrayList<UsuarioCustomModel>(); 
        try {
            String sql = "select tp.CEDULA, tp.NOMBRES, tp.APELLIDOS from USUARIOS as tu "
                    + "inner join PERSONA as tp "
                    + "on tu.ID_CEDULA = tp.CEDULA "
                    + "where tu.ID_ROL = ? and tp.ESTADO = ? ";

            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setObject(2, estado);
            rs = ps.executeQuery();
            while (rs.next()) {                
                UsuarioCustomModel docente = new UsuarioCustomModel();
                docente.setCedula(rs.getString(1));
                docente.setNombres(rs.getString(2));
                docente.setApellidos(rs.getString(3));
                listaDocente.add(docente);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "actionFindAllDocentes: "+e.getMessage());
        }
        return listaDocente;
    }
    
    
        public void modificarEstado(boolean estado, String cedula) {
        String sql = "update PERSONA set ESTADO=? where CEDULA=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, estado);
            ps.setObject(2, cedula);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GestorDocenteManager - modificarEstado: "+e.getMessage());
        }
    }

}
