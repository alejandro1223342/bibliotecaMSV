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
public class Modelo_Actividad {

    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public int getTotoal_boletos() {
        return totoal_boletos;
    }

    public void setTotoal_boletos(int totoal_boletos) {
        this.totoal_boletos = totoal_boletos;
    }

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

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getHora_creacion() {
        return hora_creacion;
    }

    public void setHora_creacion(String hora_creacion) {
        this.hora_creacion = hora_creacion;
    }

    public String getHora_inicio_venta() {
        return hora_inicio_venta;
    }

    public void setHora_inicio_venta(String hora_inicio_venta) {
        this.hora_inicio_venta = hora_inicio_venta;
    }

    public String getHora_final_venta() {
        return hora_final_venta;
    }

    public void setHora_final_venta(String hora_final_venta) {
        this.hora_final_venta = hora_final_venta;
    }
    private int id_actividad;
    private int totoal_boletos;
    private String id_organizador_user;
    private Boolean estado;
    private String fecha_creacion;
    private String fecha_venta;
    private String hora_creacion;
    private String hora_inicio_venta;
    private String hora_final_venta;
            
}
