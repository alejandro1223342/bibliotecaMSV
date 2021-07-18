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

/**
 *
 * @author alejo
 */
public class Crear_CategoriaManager {
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso; 
    
    public int CrearCategoria (String NOMBRE_UNIQUE){
        int rowsAffect=0;
        try {
            String sql="insert into CATEGORIAS (NOMBRE_UNIQUE) values (?)";
            acceso=con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, NOMBRE_UNIQUE);
           rowsAffect=ps.executeUpdate();
        } catch (Exception e) {
        }return rowsAffect;

}  
    
}
