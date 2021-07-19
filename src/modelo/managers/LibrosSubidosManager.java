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

    public ArrayList<LibrosSubidosModel> FindAllLibrosSubidos(boolean estado,String cedula) {

        ArrayList<LibrosSubidosModel> ListaLibro = new ArrayList<LibrosSubidosModel>();
        try {
            String sql = "select th.ID_LIBRO,tl.TITULO from HISTORIAL as th "
                    + "inner join LIBRO as tl "
                    + "on th.ID_LIBRO=tl.ID_LIBRO "
                    + "where th.ID_CEDULA=?";

            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, cedula);
            rs = ps.executeQuery();
            while (rs.next()) {
                LibrosSubidosModel LibrosS = new LibrosSubidosModel();
                LibrosS.setIdlibro(rs.getInt(1));
                LibrosS.setTitulolibro(rs.getString(2));
                ListaLibro.add(LibrosS);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LibrosSubidosManager-FindAllLibrosSubidos: " + e.getMessage());

        }
        return ListaLibro;
    }


}
