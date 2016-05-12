/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.gerenciador.web.controller;

import br.com.isports.acesso.acesso.UsuarioServiceAcesso;
import br.com.isports.clientews.usuarioservice.BuscarUsuarioDTO;
import br.com.isports.clientews.usuarioservice.InValidarUsuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author dudu
 */
@ViewScoped
@ManagedBean(name = "loginController")
public class LoginController {
    
    public void logar(){
        UsuarioServiceAcesso acesso = new UsuarioServiceAcesso();
        InValidarUsuario in = new InValidarUsuario();
        in.setDados(new BuscarUsuarioDTO());
        in.getDados().setLogin("duduceolin");
        in.getDados().setSenha("123123123");
        System.out.println(acesso.validarUsuario(in));
    }
}
