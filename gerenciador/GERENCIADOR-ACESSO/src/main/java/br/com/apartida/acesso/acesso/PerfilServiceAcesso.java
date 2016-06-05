/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.acesso.acesso;

import br.com.apartida.acesso.locate.PerfilServiceLocate;
import br.com.apartida.servicos.perfilservice.InCadastrarAlterarPerfil;
import br.com.apartida.servicos.perfilservice.InPesquisarPelaEmpresa;
import br.com.apartida.servicos.perfilservice.IspoException_Exception;
import br.com.apartida.servicos.perfilservice.OutCadastrarAlterarPerfil;
import br.com.apartida.servicos.perfilservice.OutPesquisarPerfis;
import br.com.apartida.servicos.perfilservice.PerfilService;
import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class PerfilServiceAcesso implements Serializable {

    private static final long serialVersionUID = 8248169515638140927L;

    private PerfilService servico;

    public PerfilServiceAcesso() {
        try {
            this.servico = new PerfilServiceLocate().get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public OutPesquisarPerfis pesquisarPerfisPelaEmpresa(InPesquisarPelaEmpresa inPesquisar) throws IspoException_Exception {
        return this.servico.pesquisarPerfisPelaEmpresa(inPesquisar);
    }

    public OutCadastrarAlterarPerfil cadastrarAlterarPerfil(InCadastrarAlterarPerfil inCadastrar) throws IspoException_Exception {
        return this.servico.cadastrarAlterarPerfil(inCadastrar);
    }
}
