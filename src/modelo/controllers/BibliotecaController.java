package modelo.controllers;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.managers.BibliotecaManager;
import modelos.entidades.LibroModel;
import vistas.administrador.frmGestorDocente;
import vistas.biblioteca.frmBiblioteca;

public class BibliotecaController {

    BibliotecaManager bbm = new BibliotecaManager();

    public void actionLlenarPrediccion(TextAutoCompleter autoCompletarLibro) {

        ArrayList<String> listaIDs = bbm.findAllLibroID();
        ArrayList<String> listaTitulos = bbm.findAllLibroTitulo();
        if (listaIDs.size() > 0) {
            for (int i = 0; i < listaIDs.size(); i++) {
                autoCompletarLibro.addItem(listaIDs.get(i));
            }
        }
        if (listaTitulos.size() > 0) {
            for (int i = 0; i < listaTitulos.size(); i++) {
                autoCompletarLibro.addItem(listaTitulos.get(i));
            }
        }

    }

    public ArrayList<LibroModel> actionFindLibrosByIdOrTitle(ArrayList<LibroModel> listaEncontrados, String parametro) {
        listaEncontrados = bbm.findLibroByTituloOrID(parametro);
        return listaEncontrados;
    }

    public void actionMostrarLibrosEncontradosByIdOrTitle(DefaultTableModel modelo,
            ArrayList<LibroModel> listaEncontrados) {
        for (int i = 0; i < listaEncontrados.size(); i++) {
            Object[] ob = new Object[3];
            ob[0] = listaEncontrados.get(i).getId_libro();
            ob[1] = listaEncontrados.get(i).getTitulo();
            ob[2] = listaEncontrados.get(i).getAutor();
            modelo.addRow(ob);
        }

    }

    public void actionMostrarDatosLibro(DefaultTableModel modelo, ArrayList<LibroModel> listaEncontrados, int fila) {
        if (fila == -1) {
        } else {
            int idLibro = Integer.parseInt(modelo.getValueAt(fila, 0).toString());

            for (int i = 0; i < listaEncontrados.size(); i++) {
                if (idLibro == listaEncontrados.get(i).getId_libro()) {
                    frmBiblioteca.txtsubidoPor.setText(listaEncontrados.get(i).getSubidoPor());
                    frmBiblioteca.txtautor.setText(listaEncontrados.get(i).getAutor());
                    frmBiblioteca.txaDescripcion.setText(listaEncontrados.get(i).getDescripcion());
                    frmBiblioteca.txaUrl.setText(listaEncontrados.get(i).getUrl());
                }
            }
        }
    }

    public void actionMostrarCategoriasLibro(
            DefaultTableModel modeloEncontrados,
            DefaultTableModel modeloCategorias,
            int fila) {
        if (fila == -1) {
        } else {
            int idLibro = Integer.parseInt(modeloEncontrados.getValueAt(fila, 0).toString());
            ArrayList<String> listaLibroCategorias = new ArrayList<String>();
            //se limpia tabla categorias cada vez que se elije un nuevo registro
            limpiarTabla(modeloCategorias);
            listaLibroCategorias = bbm.FindLibroCategorias(idLibro);
            
            for (int i = 0; i < listaLibroCategorias.size(); i++) {
                Object[] ob = new Object[1];
                ob[0]= listaLibroCategorias.get(i);
                modeloCategorias.addRow(ob);
            }
            
        }

    }
    
    public void actionMostrarMateriasLibro(
            DefaultTableModel modeloEncontrados,
            DefaultTableModel modeloMaterias,
            int fila) {
        if (fila == -1) {
        } else {
            int idLibro = Integer.parseInt(modeloEncontrados.getValueAt(fila, 0).toString());
            ArrayList<String> listaLibroMaterias = new ArrayList<String>();
            //se limpia tabla categorias cada vez que se elije un nuevo registro
            limpiarTabla(modeloMaterias);
            listaLibroMaterias = bbm.FindLibroMaterias(idLibro);
            
            for (int i = 0; i < listaLibroMaterias.size(); i++) {
                Object[] ob = new Object[1];
                ob[0]= listaLibroMaterias.get(i);
                modeloMaterias.addRow(ob);
            }
            
        }

    }

    public void EncerarInputs() {
        frmBiblioteca.txtsubidoPor.setText("");
        frmBiblioteca.txtautor.setText("");
        frmBiblioteca.txaDescripcion.setText("");
        frmBiblioteca.txaUrl.setText("");
    }

    public void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i < modelo.getRowCount(); i++) { //siempre va a eliminar la fila cero
            modelo.removeRow(i);
            i = i - 1;
        }
    }

}
