package modelo.managers;

import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.entidades.CategoriasModel;
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

}
