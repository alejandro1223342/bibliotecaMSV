package modelo.controllers;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import modelo.managers.SubirLibroManager;
import modelos.entidades.CategoriasModel;
import modelos.entidades.HistorialModel;
import modelos.entidades.LibroModel;
import modelos.entidades.MateriasModel;
import vistas.docente.frmUsuarios_SubirLibros;

public class SubirLibroController {

    SubirLibroManager slm = new SubirLibroManager();

    public ArrayList<CategoriasModel> actionFindAllCategorias() {
        return slm.finAllCategorias();
    }

    public ArrayList<MateriasModel> actionFindAllMaterias() {
        return slm.finAllMaterias();
    }

    public void actionllenarPrediccion(TextAutoCompleter autoCompletarCategoria,
            TextAutoCompleter autoCompletarMateria,
            ArrayList<CategoriasModel> listaCategoria,
            ArrayList<MateriasModel> listaMateria) {

        for (int i = 0; i < listaCategoria.size(); i++) {
            autoCompletarCategoria.addItem(listaCategoria.get(i).getNombre());
        }
        for (int i = 0; i < listaMateria.size(); i++) {
            autoCompletarMateria.addItem(listaMateria.get(i).getNombre());
        }

    }

    public void actionAgregarCategoria(ArrayList<CategoriasModel> listaCategoria,
            String selectCategoria, DefaultTableModel modelo) {
        boolean bandera = false;
        for (int i = 0; i < listaCategoria.size(); i++) {

            if (listaCategoria.get(i).getNombre().equals(selectCategoria)) {
                bandera = true;
                if (validarRepetidos(selectCategoria, modelo) == false) {
                    Object ob[] = new Object[2];
                    ob[0] = listaCategoria.get(i).getId_categoria();
                    ob[1] = listaCategoria.get(i).getNombre();
                    modelo.addRow(ob);
                    break;
                } else {

                    JOptionPane.showMessageDialog(null, "Categoria repetida", "Alerta", JOptionPane.WARNING_MESSAGE);
                    break;

                }

            }
            if (i == listaCategoria.size() - 1 && bandera == false) {
                //aseguramos que se agregue una categoria que se encuentre en la lista
                //categorias traida desde la base de datos
                JOptionPane.showMessageDialog(null, "Categoria inexistente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void actionAgregarMateria(ArrayList<MateriasModel> listaMateria,
            String selectMateria, DefaultTableModel modelo) {
        boolean bandera = false;
        for (int i = 0; i < listaMateria.size(); i++) {

            if (listaMateria.get(i).getNombre().equals(selectMateria)) {
                bandera = true;
                if (validarRepetidos(selectMateria, modelo) == false) {
                    Object ob[] = new Object[2];
                    ob[0] = listaMateria.get(i).getId_materia();
                    ob[1] = listaMateria.get(i).getNombre();
                    modelo.addRow(ob);
                    break;
                } else {

                    JOptionPane.showMessageDialog(null, "Materia repetida", "Alerta", JOptionPane.WARNING_MESSAGE);
                    break;

                }

            }
            if (i == listaMateria.size() - 1 && bandera == false) {
                //aseguramos que se agregue una categoria que se encuentre en la lista
                //categorias traida desde la base de datos
                JOptionPane.showMessageDialog(null, "Materia inexistente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void actionSubirLibro(LibroModel libro) {
        slm.registrarLibro(libro);   
    }

    public void actionSubirLibroCategorias(DefaultTableModel modelo) throws Exception {
        int id_libro= actionObtenerUltimoIdLibro();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            slm.registrarLibroCategoria(id_libro, Integer.parseInt(modelo.getValueAt(i, 0).toString()));
        }
    }

    public void actionSubirLibroMaterias(DefaultTableModel modelo) throws Exception {
        int id_libro= actionObtenerUltimoIdLibro();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            slm.registrarLibroMateria(id_libro, Integer.parseInt(modelo.getValueAt(i, 0).toString()));
        }
    }
    
    public void actionSubirHistorial(HistorialModel historial) throws Exception{
        slm.agregarHistorial(historial);
    }
    
    public int actionObtenerUltimoIdLibro() throws Exception{
        return slm.obtenerUltimoIdLibro();
    }

    public boolean validarRepetidos(String select, DefaultTableModel modelo) {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (modelo.getValueAt(i, 1).toString().equals(select)) {
                return true; // si es true -> quiere decir que si se repite
            }
        }
        return false;// si es false -> quiere decir que no se repite
    }

    public void encerarInputs(){
        frmUsuarios_SubirLibros.txtAutor.setText("");
        frmUsuarios_SubirLibros.txtDescripcion.setText("");
        frmUsuarios_SubirLibros.txtTitulo.setText("");
        frmUsuarios_SubirLibros.txtUrl.setText("");
        frmUsuarios_SubirLibros.txtcategoria.setText("");
        frmUsuarios_SubirLibros.txtmateria.setText("");
        
    }
    
    
    public void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i < modelo.getRowCount(); i++) { //siempre va a eliminar la fila cero
            modelo.removeRow(i);
            i = i - 1;
        }
    }

}
