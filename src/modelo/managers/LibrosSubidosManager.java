/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.managers;

import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.entidades.LibrosSubidosModel;

/**
 *
 * @author alejo
 */
public class LibrosSubidosManager {

    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;

    public ArrayList<LibrosSubidosModel> FindAllLibros(boolean estado) {

        ArrayList<LibrosSubidosModel> ListaLibro = new ArrayList<LibrosSubidosModel>();
        try {
            String sql = "select th.ID_LIBRO,tl.TITULO from HISTORIAL as th "
                    + "inner join LIBRO as tl "
                    + "on th.ID_LIBRO=tl.ID_LIBRO "
                    + "where  tl.ESTADO = ? and th.ID_CEDULA=?";

            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setObject(2, estado);
            rs = ps.executeQuery();
            while (rs.next()) {
                LibrosSubidosModel LibrosS = new LibrosSubidosModel();
                LibrosS.setIdlibro(rs.getInt(1));
                LibrosS.setTitulolibro(rs.getString(2));
                ListaLibro.add(LibrosS);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "actionFindAllLibros: " + e.getMessage());

        }
        return ListaLibro;
    }

    public void modificarEstado(boolean ID_ROL, boolean estado) {
        String sql = "update PERSONA set ID_ROL=? where ESTADO=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, ID_ROL);
            ps.setObject(2, estado);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LibrosSubidosManager - modificarEstado: " + e.getMessage());
        }
    }

}
