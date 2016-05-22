/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.gerenciador.web.controller;

import br.com.isports.gerenciador.web.util.FacesUtils;
import br.com.isoccer.servicos.usuarioservice.BuscarUsuarioDTO;
import br.com.isoccer.servicos.usuarioservice.InBuscarUsuario;
import br.com.isoccer.servicos.usuarioservice.IspoException_Exception;
import br.com.isoccer.servicos.usuarioservice.UsuarioDTO;
import br.com.isports.acesso.acesso.UsuarioServiceAcesso;
import br.com.isports.gerenciador.web.util.SessionContext;
import br.com.isports.gerenciador.web.util.TipoErro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author dudu
 */
@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController extends BaseController {

    private UsuarioDTO usuario;

    private final UsuarioServiceAcesso acesso;

    public LoginController() {
        usuario = new UsuarioDTO();
        acesso = new UsuarioServiceAcesso();
    }

    public String logar() {

        try {
            UsuarioDTO logado = acesso.buscarUsuario(gerarInBuscarUsuario(usuario)).getUsuario();
            SessionContext.getInstance().setAttribute("usuarioLogado", logado);

            return "/restrito/Dashboard.jsf?faces-redirect=true";
        } catch (IspoException_Exception e) {
            mostrarMensagemErro(e.getMessage());
        } catch (Exception e) {
            mostrarMensagemErro(TipoErro.COMUNICACAO.getMensagem());
            logger.error(e.getLocalizedMessage());
        }

        return "";
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
