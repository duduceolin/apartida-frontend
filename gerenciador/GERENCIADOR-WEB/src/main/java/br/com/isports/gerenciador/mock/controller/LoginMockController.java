/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.gerenciador.mock.controller;

import br.com.isports.gerenciador.mock.dtos.UsuarioDTO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author dudu
 */
@ManagedBean(name = "loginMockController")
@SessionScoped
public class LoginMockController {

    private UsuarioDTO usuario;

    public LoginMockController() {
        usuario = new UsuarioDTO();
    }

    public String logar() {
        try {

            usuario.setNome("Eduardo Ceolin");
            usuario.setId(1);

            return "/restrito/Dashboard.jsf?faces-redirect=true";
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            FacesContext.getCurrentInstance().validationFailed();
            e.printStackTrace();
            return "";
        }

    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

}
