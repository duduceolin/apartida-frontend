
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

    private final static QName _PesquisarFuncionalidadesEmpresaResponse_QNAME = new QName("http://apartida.com.br/servicos/FuncionalidadeService", "pesquisarFuncionalidadesEmpresaResponse");
    private final static QName _IspoException_QNAME = new QName("http://apartida.com.br/servicos/FuncionalidadeService", "IspoException");
    private final static QName _PesquisarFuncionalidadesEmpresa_QNAME = new QName("http://apartida.com.br/servicos/FuncionalidadeService", "pesquisarFuncionalidadesEmpresa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.apartida.servicos.funcionalidadeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InPesquisarPelaEmpresa }
     * 
     */
    public InPesquisarPelaEmpresa createInPesquisarPelaEmpresa() {
        return new InPesquisarPelaEmpresa();
    }

    /**
     * Create an instance of {@link IspoException }
     * 
     */
    public IspoException createIspoException() {
        return new IspoException();
    }

    /**
     * Create an instance of {@link OutPesquisarFuncionalidades }
     * 
     */
    public OutPesquisarFuncionalidades createOutPesquisarFuncionalidades() {
        return new OutPesquisarFuncionalidades();
    }

    /**
     * Create an instance of {@link FuncionalidadeDTO }
     * 
     */
    public FuncionalidadeDTO createFuncionalidadeDTO() {
        return new FuncionalidadeDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutPesquisarFuncionalidades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/FuncionalidadeService", name = "pesquisarFuncionalidadesEmpresaResponse")
    public JAXBElement<OutPesquisarFuncionalidades> createPesquisarFuncionalidadesEmpresaResponse(OutPesquisarFuncionalidades value) {
        return new JAXBElement<OutPesquisarFuncionalidades>(_PesquisarFuncionalidadesEmpresaResponse_QNAME, OutPesquisarFuncionalidades.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InPesquisarPelaEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/FuncionalidadeService", name = "pesquisarFuncionalidadesEmpresa")
    public JAXBElement<InPesquisarPelaEmpresa> createPesquisarFuncionalidadesEmpresa(InPesquisarPelaEmpresa value) {
        return new JAXBElement<InPesquisarPelaEmpresa>(_PesquisarFuncionalidadesEmpresa_QNAME, InPesquisarPelaEmpresa.class, null, value);
    }

}
