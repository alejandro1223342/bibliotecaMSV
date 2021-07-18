/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controllers;

import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.managers.Crear_MateriaManager;

/**
 *
 * @author alejo
 */
public class Crear_MateriaController {

    Crear_MateriaManager cmc = new Crear_MateriaManager();
    
    public void CrearMateria(String NOMBRE_UNIQUE){
        if (cmc.CrearMateria(NOMBRE_UNIQUE) > 0) {
            JOptionPane.showMessageDialog(null, "Se creo la Matería");
        }else{
            JOptionPane.showMessageDialog(null, "No se creo ninguna Matería");
        }
    }

}
