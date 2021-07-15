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
public class Modelo_organizador {
    private String id_organizador_user;
    private Boolean estado;

    public String getId_organizador_user() {
        return id_organizador_user;
    }

    public void setId_organizador_user(String id_organizador_user) {
        this.id_organizador_user = id_organizador_user;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
