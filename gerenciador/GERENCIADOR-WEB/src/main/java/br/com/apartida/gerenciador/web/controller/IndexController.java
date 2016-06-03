/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.web.controller;

import br.com.apartida.acesso.acesso.FuncionalidadeServiceAcesso;
import br.com.apartida.servicos.funcionalidadeservice.FuncionalidadeToMenuDTO;
import br.com.apartida.servicos.funcionalidadeservice.InPesquisarFuncionalidadesPlano;
import br.com.apartida.servicos.funcionalidadeservice.IspoException_Exception;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author dudu
 */
@ManagedBean(name = "indexController")
@RequestScoped
public class IndexController extends BaseController {

    private List<FuncionalidadeToMenuDTO> menu;

    @ManagedProperty("#{usuarioLogadoController}")
    private UsuarioLogadoController usuarioLogadoController;

    @Override
    @PostConstruct
    public void postConstruct() {
        FuncionalidadeServiceAcesso acesso = new FuncionalidadeServiceAcesso();

        try {
            InPesquisarFuncionalidadesPlano in = new InPesquisarFuncionalidadesPlano();
            in.setIdPlano(usuarioLogadoController.getUsuarioLogado().getPerfil().getEmpresa().getPlano().getId());
            menu = acesso.pesquisarFuncionalidadesPlanoMenu(in).getMenu();
        } catch (IspoException_Exception e) {
            mostrarMensagemErro(e.getMessage());
        }
    }

    public List<FuncionalidadeToMenuDTO> getMenu() {
        return menu;
    }

    public void setMenu(List<FuncionalidadeToMenuDTO> menu) {
        this.menu = menu;
    }

    public UsuarioLogadoController getUsuarioLogadoController() {
        return usuarioLogadoController;
    }

    public void setUsuarioLogadoController(UsuarioLogadoController usuarioLogadoController) {
        this.usuarioLogadoController = usuarioLogadoController;
    }

}
