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
import modelos.entidades.Modelo_persona;

/**
 *
 * @author alejo
 */
public class Control_persona {

    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection acceso;

    public void insertar(Modelo_persona per) {

        try {
            String sql = "insert into `actividades_economicas`.`persona` (`CEDULA`, `NOMBRES`, `APELLIDOS`,`FECHA_NACIMIENTO`,`DIRECCION_RESIDENCIA`,`CIUDAD_RESIDENCIA`) VALUES ('?','?','?','?','?','?');";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, per.getCedula());
            ps.setObject(2, per.getNombres());
            ps.setObject(3, per.getApellidos());
            ps.setObject(4, per.getFecha_nacimiento());
            ps.setObject(5, per.getDireccion_residencia());
            ps.setObject(6, per.getCiudad_residencia());
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

    public ArrayList<Modelo_persona> consulta() {

        ArrayList<Modelo_persona> listaper = new ArrayList<>();

        try {

            String sql = "select * from persona;";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_persona per = new Modelo_persona();
                per.setCedula(rs.getString(1));
                per.setNombres(rs.getString(2));
                per.setApellidos(rs.getString(3));
                per.setFecha_nacimiento(rs.getString(4));
                per.setDireccion_residencia(rs.getString(5));
                per.setCiudad_residencia(rs.getString(6));
                listaper.add(per);
            }

        } catch (Exception e) {
        }

        return listaper;
    }

    public void actualizar(Modelo_persona per) {
        String sql = "update persona set CEDULA=?,NOMBRES=?,APELLIDOS=?,FEHCA_NACIMIENTO=?,FECHA_RESIDENCIA_CIUDAD_RESIDENCIA where CEDULA=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, per.getCedula());
            ps.setObject(2, per.getTitulo());
            ps.setObject(3, per.getCantidad());
            ps.setObject(4, per.getEstado());
            ps.setObject(5, per.getIsbn());
            ps.setObject(6, per.getIsbn());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void eliminar(int id) {
        String sql = "update libro set estado=? where idlibro=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, 0);
            ps.setObject(2, id);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void habilitar(int id) {
        String sql = "update libro set estado=? where idlibro=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, 1);
            ps.setObject(2, id);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
