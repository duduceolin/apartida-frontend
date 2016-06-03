/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.web.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author dudu
 */
@ManagedBean(name = "perfilController")
@RequestScoped
public class PerfilController extends BaseController {

    @ManagedProperty("#{usuarioLogadoController}")
    private UsuarioLogadoController usuarioLogadoController;
    

    @PostConstruct
    @Override
    public void postConstruct() {
    }

}
