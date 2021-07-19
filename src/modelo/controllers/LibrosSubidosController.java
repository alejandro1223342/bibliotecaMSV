/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.managers.LibrosSubidosManager;
import modelos.entidades.LibrosSubidosModel;
import modelos.entidades.UsuarioCustomModel;


public class LibrosSubidosController {

    LibrosSubidosManager lsm = new LibrosSubidosManager();

    public ArrayList<LibrosSubidosModel> ActionFindAllLibrosSubidos(boolean estado, String cedula) {

        ArrayList<LibrosSubidosModel> ListaLibro = new ArrayList<LibrosSubidosModel>();
        ListaLibro = lsm.FindAllLibrosSubidos(estado, cedula);

        return ListaLibro;
    }

    public void ActionMostrarLibrosSubidos(ArrayList<LibrosSubidosModel> ListaLibro, DefaultTableModel modelo) {
        Object ob[] = new Object[2];
        for (int i = 0; i < ListaLibro.size(); i++) {
            ob[0] = ListaLibro.get(i).getIdlibro();
            ob[1] = ListaLibro.get(i).getTitulolibro();
            modelo.addRow(ob);
        }
    }


}
