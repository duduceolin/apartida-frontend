/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.acesso.locate;

import br.com.apartida.acesso.utils.CacheLocate;
import br.com.apartida.servicos.funcionalidadeservice.FuncionalidadeService;
import br.com.apartida.servicos.funcionalidadeservice.FuncionalidadeService_Service;

/**
 *
 * @author dudu
 */
public class FuncionalidadeServiceLocate {

    public static final String SERVICENAME = "FuncionalidadeService";

    public FuncionalidadeService get() throws Exception {
        FuncionalidadeService service = (FuncionalidadeService) CacheLocate.getInstance().get(SERVICENAME);
        if (service == null) {
            service = new FuncionalidadeService_Service().getFuncionalidadeServicePort();
            CacheLocate.getInstance().put(SERVICENAME, service);
        }
        return service;
    }
}
