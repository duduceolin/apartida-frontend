/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.app.web.filter;

import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class UsuarioSearch implements Serializable {

    private static final long serialVersionUID = 8321132051778917591L;

    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
