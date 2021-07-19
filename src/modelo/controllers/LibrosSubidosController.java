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

/**
 *
 * @author alejo
 */
public class LibrosSubidosController {

    LibrosSubidosManager lsm = new LibrosSubidosManager();

    public void ActionFindAllLibrosS(boolean estado, DefaultTableModel modelo) {

        ArrayList<LibrosSubidosModel> ListaLibro = new ArrayList<LibrosSubidosModel>();

        ListaLibro = lsm.FindAllLibros(estado);

        ActionFindAllLibrosS(ListaLibro, modelo);
    }

    public void ActionFindAllLibrosS(ArrayList<LibrosSubidosModel> ListaLibro, DefaultTableModel modelo) {
        Object ob[] = new Object[2];
        for (int i = 0; i < ListaLibro.size(); i++) {
            ob[0] = ListaLibro.get(i).getIdlibro();
            ob[1] = ListaLibro.get(i).getTitulolibro();
            modelo.addRow(ob);
        }
    }

    public void actionCambiarEstado(boolean ID_ROL, boolean estado ) {
        lsm.modificarEstado(ID_ROL, estado);
    }
    
    public void actionDatosEnInputs(int fila, DefaultTableModel modelo) {
        if (fila == -1) {
        } else {
            String idlibro = modelo.getValueAt(fila, 0).toString();
            String titulolibro = modelo.getValueAt(fila, 1).toString();
        }
    }

}
