package modelo.managers;

import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.entidades.LibroModel;

public class BibliotecaManager {

    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;

    public ArrayList<String> findAllLibroID() {
        ArrayList<String> Lista = new ArrayList<>();

        try {

            String sql = "select ID_LIBRO from LIBRO";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            //ps.setObject(1, id+"%");
            rs = ps.executeQuery();
            while (rs.next()) {

                Lista.add(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: BibliotecaManager: findLibroByID" + e.getStackTrace());
        }

        return Lista;
    }

    public ArrayList<String> findAllLibroTitulo() {
        ArrayList<String> Lista = new ArrayList<>();

        try {

            String sql = "select TITULO from LIBRO";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            //ps.setObject(1, "%"+titulo+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Lista.add(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: BibliotecaManager: findLibroByTItulo" + e.getStackTrace());
        }

        return Lista;
    }

    public ArrayList<LibroModel> findLibroByTituloOrID(String parametro) {
        ArrayList<LibroModel> listaLibro = new ArrayList<LibroModel>();
        LibroModel libro;
        try {

            String sql = "select tl.*, concat(NOMBRES,' ',APELLIDOS) as SUBIDO_POR from LIBRO as tl "
                    + "inner join HISTORIAL as th "
                    + "on tl.ID_LIBRO = th.ID_LIBRO "
                    + "inner join PERSONA as tp "
                    + "on th.ID_CEDULA = tp.CEDULA "
                    + "where tl.ID_LIBRO = ? or tl.TITULO= ? ";
            
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, parametro);
            ps.setObject(2, parametro);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro = new LibroModel();
                libro.setId_libro(rs.getInt(1));
                libro.setTitulo(rs.getString(2));
                libro.setDescripcion(rs.getString(3));
                libro.setAutor(rs.getString(4));
                libro.setUrl(rs.getString(5));
                libro.setEstado(rs.getBoolean(6));
                libro.setSubidoPor(rs.getString(7));
                listaLibro.add(libro);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: BibliotecaManager: findLibroByTituloOrID" + e.getStackTrace());
        }

        return listaLibro;
    }

}
