package br.com.apartida.gerenciador.web.util;

import java.io.Serializable;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class UserSettings implements Serializable {

    private static final long serialVersionUID = 3083775688015310690L;

    private Locale locale;

    @PostConstruct
    protected void initialize() {
        locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
