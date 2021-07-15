/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controllers;

import Util.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.entidades.Modelo_Usuario;

/**
 *
 * @author alejo
 */
public class Control_usuario {

    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;

    public void insertar(Modelo_Usuario user) {

        try {
            String sql = "insert into `actividades_economicas`.`usuario` (`ID_PER`, `ID_ROL`, `CONTRASENA`,`ESTADO`,`FECHA_CREACION`) VALUES ('?','?','?','?','?');";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, user.getId_per());
            ps.setObject(2, user.getId_rol());
            ps.setObject(3, user.getContraseña());
            ps.setObject(4, 1);
            ps.setObject(5, user.getFecha_creacion());
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public ArrayList<Modelo_Usuario> consulta() {

        ArrayList<Modelo_Usuario> Lista = new ArrayList<>();

        try {

            String sql = "select * from usuario;";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_Usuario user = new Modelo_Usuario();
                user.setId_per(rs.getString(1));
                user.setId_rol(rs.getInt(2));
                user.setContraseña(rs.getString(3));
                user.setEstado(rs.getBoolean(4));
                user.setFecha_creacion(rs.getString(5));
                Lista.add(user);
            }

        } catch (Exception e) {
        }

        return Lista;
    }

    public void actualizar(Modelo_Usuario user) {
        String sql = "update usuario set ID_PER=?,ID_ROL=?,CONTRASENA=?,ESTADO=?,FECHA_CREACION=? where ID_PER=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, user.getId_per());
            ps.setObject(2, user.getId_rol());
            ps.setObject(3, user.getContraseña());
            ps.setObject(4, user.getEstado());
            ps.setObject(5, user.getFecha_creacion());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void eliminar(String Id_per) {
        String sql = "update usuario set ESTADO=? where Id_per=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, 0);
            ps.setObject(2, Id_per);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void habilitar(int Id_per) {
        String sql = "update usuario set ESTADO=? where Id_per=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, 1);
            ps.setObject(2, Id_per);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
