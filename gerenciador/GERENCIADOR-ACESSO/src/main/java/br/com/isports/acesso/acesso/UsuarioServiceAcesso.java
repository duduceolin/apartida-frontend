/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.acesso.acesso;

import br.com.isports.acesso.locate.UsuarioServiceLocate;
import br.com.isports.clientews.usuarioservice.InValidarUsuario;
import br.com.isports.clientews.usuarioservice.OutValidarUsuario;
import br.com.isports.clientews.usuarioservice.UsuarioService;
import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class UsuarioServiceAcesso implements Serializable {

    private static final long serialVersionUID = 1138178817222430896L;

    private UsuarioService servico;

    public UsuarioServiceAcesso() {
        try {
            this.servico = new UsuarioServiceLocate().get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public OutValidarUsuario validarUsuario(InValidarUsuario inValidar) {
        return servico.validarUsuario(inValidar);
    }

}
