/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.entidades;

/**
 *
 * @author alejo
 */
public class Modelo_Administrador {

    public String getId_administrador_user() {
        return id_administrador_user;
    }

    public void setId_administrador_user(String id_administrador_user) {
        this.id_administrador_user = id_administrador_user;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
   private String id_administrador_user;
   private Boolean estado;
}
