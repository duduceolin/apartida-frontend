
package br.com.apartida.servicos.funcionalidadeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.apartida.servicos.funcionalidadeservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FuncionalidadesMenu_QNAME = new QName("http://apartida.com.br/servicos/FuncionalidadeService", "funcionalidadesMenu");
    private final static QName _IspoException_QNAME = new QName("http://apartida.com.br/servicos/FuncionalidadeService", "IspoException");
    private final static QName _InPesquisarFuncionalidadesPlano_QNAME = new QName("http://apartida.com.br/servicos/FuncionalidadeService", "InPesquisarFuncionalidadesPlano");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.apartida.servicos.funcionalidadeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutPesquisarFuncionalidadesPlano }
     * 
     */
    public OutPesquisarFuncionalidadesPlano createOutPesquisarFuncionalidadesPlano() {
        return new OutPesquisarFuncionalidadesPlano();
    }

    /**
     * Create an instance of {@link IspoException }
     * 
     */
    public IspoException createIspoException() {
        return new IspoException();
    }

    /**
     * Create an instance of {@link InPesquisarFuncionalidadesPlano }
     * 
     */
    public InPesquisarFuncionalidadesPlano createInPesquisarFuncionalidadesPlano() {
        return new InPesquisarFuncionalidadesPlano();
    }

    /**
     * Create an instance of {@link FuncionalidadeToMenuDTO }
     * 
     */
    public FuncionalidadeToMenuDTO createFuncionalidadeToMenuDTO() {
        return new FuncionalidadeToMenuDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutPesquisarFuncionalidadesPlano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/FuncionalidadeService", name = "funcionalidadesMenu")
    public JAXBElement<OutPesquisarFuncionalidadesPlano> createFuncionalidadesMenu(OutPesquisarFuncionalidadesPlano value) {
        return new JAXBElement<OutPesquisarFuncionalidadesPlano>(_FuncionalidadesMenu_QNAME, OutPesquisarFuncionalidadesPlano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IspoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/FuncionalidadeService", name = "IspoException")
    public JAXBElement<IspoException> createIspoException(IspoException value) {
        return new JAXBElement<IspoException>(_IspoException_QNAME, IspoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InPesquisarFuncionalidadesPlano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/FuncionalidadeService", name = "InPesquisarFuncionalidadesPlano")
    public JAXBElement<InPesquisarFuncionalidadesPlano> createInPesquisarFuncionalidadesPlano(InPesquisarFuncionalidadesPlano value) {
        return new JAXBElement<InPesquisarFuncionalidadesPlano>(_InPesquisarFuncionalidadesPlano_QNAME, InPesquisarFuncionalidadesPlano.class, null, value);
    }

}
