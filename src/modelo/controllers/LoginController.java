/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controllers;

import Util.conexion;
import com.sun.org.apache.bcel.internal.generic.IFEQ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.managers.LoginManager;
import modelos.entidades.PersonaModel;

/**
 *
 * @author alejo
 */
public class LoginController {
    LoginManager lm= new LoginManager();
    
    public boolean actionLogin (String NOMBRE_ROL, String ID_CEDULA, String CLAVE){
        int id_rol = 0;
        if (NOMBRE_ROL.equals("Docente")) {
            id_rol = 1;
        }else if (NOMBRE_ROL.equals("Administrador")) {
            id_rol = 2;
        }
        return lm.LoginUsuario(id_rol, ID_CEDULA,CLAVE);
    }
    
    
}
