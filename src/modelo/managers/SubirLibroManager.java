package modelo.managers;

import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.entidades.CategoriasModel;
import modelos.entidades.HistorialModel;
import modelos.entidades.LibroModel;
import modelos.entidades.MateriasModel;

public class SubirLibroManager {

    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;

    public ArrayList<CategoriasModel> finAllCategorias() {
        ArrayList<CategoriasModel> listaCategoria = new ArrayList<CategoriasModel>();
        String sql = "select * from CATEGORIAS";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                CategoriasModel categoria = new CategoriasModel();
                categoria.setId_categoria(rs.getInt(1));
                categoria.setNombre(rs.getString(2));
                listaCategoria.add(categoria);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SubirLibroManager-findAllCategorias: "+e.getMessage());
        }

        return listaCategoria;
    }

    public ArrayList<MateriasModel> finAllMaterias() {
        ArrayList<MateriasModel> listaMateria = new ArrayList<MateriasModel>();
        String sql = "select * from MATERIAS";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MateriasModel materia = new MateriasModel();
                materia.setId_materia(rs.getInt(1));
                materia.setNombre(rs.getString(2));
                listaMateria.add(materia);
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "SubirLibroManager-findAllMaterias: "+e.getMessage());
        }

        return listaMateria;
    }
    
    
    public void registrarLibro(LibroModel libro) {
        
        try {
            String sql = "insert into LIBRO(TITULO,DESCRIPCION,AUTOR,URL,ESTADO) VALUES (?,?,?,?,?)";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, libro.getTitulo());
            ps.setObject(2, libro.getDescripcion());
            ps.setObject(3, libro.getAutor());
            ps.setObject(4, libro.getUrl());
            ps.setObject(5, libro.isEstado());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SubirLibroManager-registrarLibro: "+e.getMessage());
        }
    }
    
    
    public void agregarHistorial(HistorialModel historial) throws Exception{
        int rowsAffect = 0;
        try {
            String sql = "insert into HISTORIAL(id_libro,id_cedula,id_rol,fecha_hora) values(?,?,?,now())";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, historial.getId_libro());
            ps.setObject(2, historial.getId_cedula());
            ps.setObject(3, historial.getId_rol());
            rowsAffect=ps.executeUpdate();
            
            if (rowsAffect==0) {
                throw new Exception("No se registro nada en el historial");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SubirLibroManager-agregarHistorial: "+e.getMessage());
        }
    }
    
    
    
    public int obtenerUltimoIdLibro() throws Exception{
        String sql = "SELECT MAX(id_libro) AS id FROM LIBRO";
        int id_libro=0;
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
               id_libro=rs.getInt("id");
            }
            if (id_libro==0) {
                throw new Exception("No se obtuvo el ultimo idLibro");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SubirLibroManager-obtenerUltimoIdLibro: "+e.getMessage());
        }
        return id_libro;
    }
    
    
     public void registrarLibroCategoria(int id_libro, int id_categoria) {

        try {
            String sql = "insert into LIBRO_CATEGORIAS VALUES (?,?)";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, id_libro);
            ps.setObject(2, id_categoria);
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SubirLibroManager-registrarLibroCategoria: "+e.getMessage());
        }
    }
     
      public void registrarLibroMateria(int id_libro, int id_materia) {

        try {
            String sql = "insert into LIBRO_MATERIAS VALUES (?,?)";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, id_libro);
            ps.setObject(2, id_materia);
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SubirLibroManager-registrarLibroMateria: "+e.getMessage());
        }
    }

}
