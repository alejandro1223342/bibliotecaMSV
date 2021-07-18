
package modelo.controllers;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.ArrayList;
import modelo.managers.SubirLibroManager;
import modelos.entidades.CategoriasModel;
import modelos.entidades.MateriasModel;

public class SubirLibroController {
    
    SubirLibroManager slm = new SubirLibroManager();
    
    
    public ArrayList<CategoriasModel> actionFindAllCategorias(){
        return slm.finAllCategorias();
    }
    
     public ArrayList<MateriasModel> actionFindAllMaterias(){
        return slm.finAllMaterias();
    }
     
    
    public void llenarPrediccion(TextAutoCompleter autoCompletarCategoria, 
            TextAutoCompleter autoCompletarMateria,
            ArrayList<CategoriasModel> listaCategoria,
            ArrayList<MateriasModel> listaMateria){
        
        for (int i = 0; i < listaCategoria.size(); i++) {
            autoCompletarCategoria.addItem(listaCategoria.get(i).getNombre());
        }
        for (int i = 0; i < listaMateria.size(); i++) {
            autoCompletarMateria.addItem(listaMateria.get(i).getNombre());
        }
        
    }
    
    
}
