/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.mock.controller;

import br.com.apartida.gerenciador.web.controller.LoginController;
import br.com.apartida.gerenciador.web.util.SessionContext;
import br.com.apartida.servicos.usuarioservice.UsuarioDTO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author dudu
 */
@ManagedBean(name = "dashboardMockController")
@RequestScoped
public class DashboardMockController {

    private UsuarioDTO usuario;

    public DashboardMockController() {
        usuario = SessionContext.getInstance().getUsuarioLogado();
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

}
