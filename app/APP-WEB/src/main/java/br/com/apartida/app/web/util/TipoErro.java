/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.app.web.util;

/**
 *
 * @author dudu
 */
public enum TipoErro {

    COMUNICACAO("Ocorreu um erro de comunicação com o serviço.");

    private final String mensagem;

    private TipoErro(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

}
