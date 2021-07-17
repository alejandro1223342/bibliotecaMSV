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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.managers.RegistroManager;
import modelos.entidades.PersonaModel;
import vistas.FormRegistro;

public class RegistroController {
    
    RegistroManager rm = new RegistroManager();
    
    public void actionRegistroDocente(PersonaModel persona, String clave) {
        try {
            if (rm.comprobarClave(clave) == true) {
                rm.registrarNuevoDocente(persona, clave);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    public void actionEncerarInputs() {
        FormRegistro.txtNombres.setText("");
        FormRegistro.txtApellidos.setText("");
        FormRegistro.txtCedula.setText("");
        FormRegistro.txtClaveDoc.setText("");
    }
    
}
