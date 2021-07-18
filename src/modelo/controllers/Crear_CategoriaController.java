/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controllers;

import javax.swing.JOptionPane;
import modelo.managers.Crear_CategoriaManager;

/**
 *
 * @author alejo
 */
public class Crear_CategoriaController {
    Crear_CategoriaManager ccm = new Crear_CategoriaManager();
    
    public void CrearCategoria (String NOMBRE_UNIQUE){
        if (ccm.CrearCategoria(NOMBRE_UNIQUE) >0) {
            JOptionPane.showMessageDialog(null, "Se creo la categoría");
        }else{
            JOptionPane.showMessageDialog(null, "No se creo ninguna categoria");
        }
    }
}
