package modelo.controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.managers.GestorDocenteManager;
import modelos.entidades.UsuarioCustomModel;
import vistas.administrador.frmGestorDocente;

public class GestorDocenteController {

    GestorDocenteManager gdm = new GestorDocenteManager();

    public void actionFindAllDocentesEstado(boolean estado, DefaultTableModel modelo) {
        ArrayList<UsuarioCustomModel> listaDocente = new ArrayList<UsuarioCustomModel>();
        listaDocente = gdm.FindAllDocentes(estado);
        limpiarTabla(modelo);
        actionFindAllDocentes(listaDocente, modelo);

    }

    public void actionFindAllDocentes(ArrayList<UsuarioCustomModel> listaDocente, DefaultTableModel modelo) {
        //el tamaño del arreglo de objetos debe ser igual al numero de columnas que tiene la tabla
        Object ob[] = new Object[3];
        for (int i = 0; i < listaDocente.size(); i++) {
            ob[0] = listaDocente.get(i).getCedula();
            ob[1] = listaDocente.get(i).getNombres();
            ob[2] = listaDocente.get(i).getApellidos();
            modelo.addRow(ob);
        }
    }

    public void actionCambiarEstado(boolean estado, String cedula) {
        gdm.modificarEstado(estado, cedula);
    }

    public void actionLimpiarImputs() {
        frmGestorDocente.txtcedula.setText("");
        frmGestorDocente.txtnombre.setText("");
        frmGestorDocente.txtapellido.setText("");
    }

    //al dar click en un registro de la tabla
    //los datos se enviaran a los inputs
    public void actionDatosEnInputs(int fila, DefaultTableModel modelo) {
        if (fila == -1) {
        } else {
            String cedula = modelo.getValueAt(fila, 0).toString();
            String nombre = modelo.getValueAt(fila, 1).toString();
            String apellido = modelo.getValueAt(fila, 2).toString();
            frmGestorDocente.txtcedula.setText(cedula);
            frmGestorDocente.txtnombre.setText(nombre);
            frmGestorDocente.txtapellido.setText(apellido);
        }
    }

    public void limpiarTabla(DefaultTableModel modelo) {
        for (int i = 0; i < modelo.getRowCount(); i++) { //siempre va a eliminar la fila cero
            modelo.removeRow(i);
            i = i - 1;
        }
    }

}
