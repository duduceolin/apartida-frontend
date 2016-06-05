/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.web.controller;

import br.com.apartida.acesso.acesso.PerfilServiceAcesso;
import br.com.apartida.gerenciador.web.dm.PerfisDataModel;
import br.com.apartida.gerenciador.web.util.FacesUtils;
import br.com.apartida.servicos.perfilservice.PerfilFuncDTO;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author dudu
 */
@ViewScoped
@ManagedBean(name = "perfilController")
public class PerfilController extends BaseController {

    @ManagedProperty("#{usuarioLogadoController}")
    private UsuarioLogadoController usuarioLogadoController;

    private PerfisDataModel dataModel;
    private PerfilFuncDTO perfilSelecionado;

    private PerfilServiceAcesso acesso;

    @PostConstruct
    @Override
    public void postConstruct() {
        acesso = new PerfilServiceAcesso();
    }

    public PerfisDataModel getDataModel() {
        if (null == dataModel) {
            dataModel = new PerfisDataModel(acesso, usuarioLogadoController.getIdEmpresaUsuario());
        }

        return dataModel;
    }

    public void setDataModel(PerfisDataModel dataModel) {
        this.dataModel = dataModel;
    }

    public UsuarioLogadoController getUsuarioLogadoController() {
        return usuarioLogadoController;
    }

    public void setUsuarioLogadoController(UsuarioLogadoController usuarioLogadoController) {
        this.usuarioLogadoController = usuarioLogadoController;
    }

    public PerfilFuncDTO getPerfilSelecionado() {
        return perfilSelecionado;
    }

    public void setPerfilSelecionado(PerfilFuncDTO perfilSelecionado) {
        this.perfilSelecionado = perfilSelecionado;
    }

}
