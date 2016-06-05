/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.acesso.locate;

import br.com.apartida.acesso.utils.CacheLocate;
import br.com.apartida.servicos.perfilservice.PerfilService;
import br.com.apartida.servicos.perfilservice.PerfilService_Service;

/**
 *
 * @author dudu
 */
public class PerfilServiceLocate {
    public static final String SERVICENAME = "PerfilService";

    public PerfilService get() throws Exception {
        PerfilService service = (PerfilService) CacheLocate.getInstance().get(SERVICENAME);
        if (service == null) {
            service = new PerfilService_Service().getPerfilServicePort();
            CacheLocate.getInstance().put(SERVICENAME, service);
        }
        return service;
    }
}
