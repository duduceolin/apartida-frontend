/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.acesso.locate;

import br.com.isports.acesso.utils.CacheLocate;
import br.com.isports.clientews.usuarioservice.UsuarioService;
import br.com.isports.clientews.usuarioservice.UsuarioService_Service;

/**
 *
 * @author dudu
 */
public class UsuarioServiceLocate {

    public static final String SERVICENAME = "UsuarioService";

    public UsuarioService get() throws Exception {
        UsuarioService service = (UsuarioService) CacheLocate.getInstance().get(SERVICENAME);
        if (service == null) {
            service = new UsuarioService_Service().getUsuarioServicePort();
            CacheLocate.getInstance().put(SERVICENAME, service);
        }
        return service;
    }
}
