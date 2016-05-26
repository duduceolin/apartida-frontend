/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.web.controller;

import br.com.isoccer.servicos.usuarioservice.BuscarUsuarioDTO;
import br.com.isoccer.servicos.usuarioservice.InBuscarUsuario;
import br.com.isoccer.servicos.usuarioservice.IspoException_Exception;
import br.com.isoccer.servicos.usuarioservice.UsuarioDTO;
import br.com.apartida.acesso.acesso.UsuarioServiceAcesso;
import br.com.apartida.gerenciador.web.filter.UsuarioSearch;
import br.com.apartida.gerenciador.web.util.SessionContext;
import br.com.apartida.gerenciador.web.util.TipoErro;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author dudu
 */
@ManagedBean(name = "loginController")
@ViewScoped
public class LoginController extends BaseController {

    private UsuarioSearch usuarioSearch;

    private UsuarioServiceAcesso acesso;

    @PostConstruct
    @Override
    public void postConstruct() {
        usuarioSearch = new UsuarioSearch();
        acesso = new UsuarioServiceAcesso();
    }

    public String logar() {

        try {
            UsuarioDTO logado = acesso.buscarUsuario(gerarInBuscarUsuario(usuarioSearch)).getUsuario();
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

    private static InBuscarUsuario gerarInBuscarUsuario(UsuarioSearch usuario) {
        InBuscarUsuario inBuscarUsuario = new InBuscarUsuario();
        inBuscarUsuario.setDadosBuscarUsuario(new BuscarUsuarioDTO());
        inBuscarUsuario.getDadosBuscarUsuario().setLogin(usuario.getLogin());
        inBuscarUsuario.getDadosBuscarUsuario().setSenha(usuario.getSenha());
        return inBuscarUsuario;
    }

    public UsuarioSearch getUsuarioSearch() {
        return usuarioSearch;
    }

    public void setUsuarioSearch(UsuarioSearch usuarioSearch) {
        this.usuarioSearch = usuarioSearch;
    }

}
