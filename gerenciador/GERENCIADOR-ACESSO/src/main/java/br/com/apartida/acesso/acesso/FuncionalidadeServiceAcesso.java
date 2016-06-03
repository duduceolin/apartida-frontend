/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.acesso.acesso;

import br.com.apartida.acesso.locate.FuncionalidadeServiceLocate;
import br.com.apartida.servicos.funcionalidadeservice.FuncionalidadeService;
import br.com.apartida.servicos.funcionalidadeservice.InPesquisarFuncionalidadesPlano;
import br.com.apartida.servicos.funcionalidadeservice.IspoException_Exception;
import br.com.apartida.servicos.funcionalidadeservice.OutPesquisarFuncionalidadesPlano;
import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class FuncionalidadeServiceAcesso implements Serializable {

    private static final long serialVersionUID = 8106196189720448297L;

    private FuncionalidadeService servico;

    public FuncionalidadeServiceAcesso() {
        try {
            this.servico = new FuncionalidadeServiceLocate().get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public OutPesquisarFuncionalidadesPlano pesquisarFuncionalidadesPlanoMenu(InPesquisarFuncionalidadesPlano inPesquisar) throws IspoException_Exception {
        return servico.pesquisarFuncionalidadesPlanoMenu(inPesquisar);
    }

}
