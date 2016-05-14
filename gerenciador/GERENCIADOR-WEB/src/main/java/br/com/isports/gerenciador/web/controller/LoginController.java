/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.gerenciador.web.controller;

import br.com.isoccer.servicos.usuarioservice.BuscarUsuarioDTO;
import br.com.isoccer.servicos.usuarioservice.InBuscarUsuario;
import br.com.isoccer.servicos.usuarioservice.InValidarUsuario;
import br.com.isoccer.servicos.usuarioservice.IspoException_Exception;
import br.com.isoccer.servicos.usuarioservice.UsuarioDTO;
import br.com.isoccer.servicos.usuarioservice.ValidarUsuarioDTO;
import br.com.isports.acesso.acesso.UsuarioServiceAcesso;
import br.com.isports.gerenciador.web.util.SessionContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author dudu
 */
@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController {

    private UsuarioDTO usuario;

    private final UsuarioServiceAcesso acesso;

    public LoginController() {
        usuario = new UsuarioDTO();
        acesso = new UsuarioServiceAcesso();
    }

    public String logar() {
        try {
            System.out.println("Tentando logar com usuário " + usuario.getLogin());

            Boolean usuarioValido = Boolean.FALSE;

            try {
                usuarioValido = acesso.validarUsuario(gerarInValidarUsuario(usuario)).isUsuarioValido();
            } catch (IspoException_Exception e) {
                //mozovo
            }

            if (!usuarioValido) {
                System.out.println("Login ou Senha errado, tente novamente !");
                FacesContext.getCurrentInstance().validationFailed();
                return "";
            } else {
                System.out.println("Usuário logado com sucesso");
                try {
                    UsuarioDTO logado = acesso.buscarUsuario(gerarInBuscarUsuario(usuario)).getUsuario();
                    SessionContext.getInstance().setAttribute("usuarioLogado", logado);
                } catch (IspoException_Exception e) {
                    //mozovo
                }
            }
            return "/restrito/Dashboard.jsf?faces-redirect=true";
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            FacesContext.getCurrentInstance().validationFailed();
            e.printStackTrace();
            return "";
        }

    }

    private static InValidarUsuario gerarInValidarUsuario(UsuarioDTO usuario) {
        InValidarUsuario inValidar = new InValidarUsuario();
        inValidar.setDadosValidarUsuario(new ValidarUsuarioDTO());
        inValidar.getDadosValidarUsuario().setLogin(usuario.getLogin());
        inValidar.getDadosValidarUsuario().setSenha(usuario.getSenha());
        return inValidar;
    }

    private static InBuscarUsuario gerarInBuscarUsuario(UsuarioDTO usuario) {
        InBuscarUsuario inBuscarUsuario = new InBuscarUsuario();
        inBuscarUsuario.setDadosBuscarUsuario(new BuscarUsuarioDTO());
        inBuscarUsuario.getDadosBuscarUsuario().setLogin(usuario.getLogin());
        inBuscarUsuario.getDadosBuscarUsuario().setSenha(usuario.getSenha());
        return inBuscarUsuario;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

}
