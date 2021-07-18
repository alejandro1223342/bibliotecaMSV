/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controllers;

import javax.swing.JOptionPane;
import modelo.managers.AdministrarClavesManager;

/**
 *
 * @author alejo
 */
public class AdministrarClavesController {
    
    AdministrarClavesManager adm = new AdministrarClavesManager();
    
    public void actionAdmiClaves(int ID_ROL, String CLAVEA, String CLAVEN){
        if ((adm.CambiarClave(ID_ROL, CLAVEA, CLAVEN)) > 0) {
            JOptionPane.showMessageDialog(null, "Clave Actualizada");
        }else{
           JOptionPane.showMessageDialog(null, "Error: Clave Actual Incorrecta"); 
        }
    } 
}
