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

    public ArrayList<String> FindLibroCategorias(int idLibro) {
        ArrayList<String> listaCategorias = new ArrayList<String>();
        try {
            String sql = "select tc.NOMBRE_UNIQUE from LIBRO_CATEGORIAS as tlc "
                    + "inner join CATEGORIAS as tc "
                    + "on tlc.ID_CATEGORIAS_LIBRO = tc.ID_CATEGORIAS_LIBRO "
                    + "where tlc.ID_LIBRO = ?";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, idLibro);
            rs = ps.executeQuery();
            while (rs.next()) {
                listaCategorias.add(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: BibliotecaManager: FindLibroCategorias" + e.getStackTrace());
        }
        return listaCategorias;
    }

    public ArrayList<String> FindLibroMaterias(int idLibro) {
        ArrayList<String> listaMaterias = new ArrayList<String>();
        try {
            String sql = "select tm.NOMBRE_UNIQUE from LIBRO_MATERIAS as tlm "
                    + "inner join MATERIAS as tm "
                    + "on tlm.ID_MATERIAS_LIBRO = tm.ID_MATERIAS_LIBRO "
                    + "where tlm.ID_LIBRO = ?";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, idLibro);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                listaMaterias.add(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: BibliotecaManager: FindLibroCategorias" + e.getStackTrace());
        }
        return listaMaterias;
    }

}
