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
public class Modelo_Colaborador {
    private String id_colaborador_user;
    private int id_actividad;
    private int numero_boletos;

    public String getId_colaborador_user() {
        return id_colaborador_user;
    }

    public void setId_colaborador_user(String id_colaborador_user) {
        this.id_colaborador_user = id_colaborador_user;
    }

    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public int getNumero_boletos() {
        return numero_boletos;
    }

    public void setNumero_boletos(int numero_boletos) {
        this.numero_boletos = numero_boletos;
    }
}
