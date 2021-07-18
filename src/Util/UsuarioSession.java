package Util;

import modelos.entidades.UsuarioCustomModel;




public class UsuarioSession {

    private static UsuarioCustomModel usuario;


    public static UsuarioCustomModel getUsuario() {
        return usuario;
    }

    public static void setUsuario(UsuarioCustomModel usuario) {
        UsuarioSession.usuario = usuario;
    }

    

}
