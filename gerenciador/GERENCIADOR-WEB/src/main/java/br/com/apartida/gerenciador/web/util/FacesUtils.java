/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.slf4j.Logger;

/**
 *
 * @author dudu
 */
public abstract class FacesUtils {

    protected Logger logger;
    
    public static void mostrarMensagemInfo(final String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", mensagem));
    }

    public static void mostrarMensagemAviso(final String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", mensagem));
    }

    public static void mostrarMensagemErro(final String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", mensagem));
    }

    public static void mostrarMensagemFatal(final String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", mensagem));
    }
}
