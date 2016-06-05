
package br.com.apartida.servicos.perfilservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.apartida.servicos.perfilservice package. 
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

    private final static QName _InCadastrarAlterarPerfil_QNAME = new QName("http://apartida.com.br/servicos/PerfilService", "inCadastrarAlterarPerfil");
    private final static QName _Status_QNAME = new QName("http://apartida.com.br/servicos/PerfilService", "status");
    private final static QName _InPesquisarPerfis_QNAME = new QName("http://apartida.com.br/servicos/PerfilService", "inPesquisarPerfis");
    private final static QName _Perfis_QNAME = new QName("http://apartida.com.br/servicos/PerfilService", "perfis");
    private final static QName _IspoException_QNAME = new QName("http://apartida.com.br/servicos/PerfilService", "IspoException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.apartida.servicos.perfilservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InCadastrarAlterarPerfil }
     * 
     */
    public InCadastrarAlterarPerfil createInCadastrarAlterarPerfil() {
        return new InCadastrarAlterarPerfil();
    }

    /**
     * Create an instance of {@link OutCadastrarAlterarPerfil }
     * 
     */
    public OutCadastrarAlterarPerfil createOutCadastrarAlterarPerfil() {
        return new OutCadastrarAlterarPerfil();
    }

    /**
     * Create an instance of {@link OutPesquisarPerfis }
     * 
     */
    public OutPesquisarPerfis createOutPesquisarPerfis() {
        return new OutPesquisarPerfis();
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
     * Create an instance of {@link GenericPagination }
     * 
     */
    public GenericPagination createGenericPagination() {
        return new GenericPagination();
    }

    /**
     * Create an instance of {@link FuncionalidadePerfilDTO }
     * 
     */
    public FuncionalidadePerfilDTO createFuncionalidadePerfilDTO() {
        return new FuncionalidadePerfilDTO();
    }

    /**
     * Create an instance of {@link PerfilFuncDTO }
     * 
     */
    public PerfilFuncDTO createPerfilFuncDTO() {
        return new PerfilFuncDTO();
    }

    /**
     * Create an instance of {@link FuncionalidadeDTO }
     * 
     */
    public FuncionalidadeDTO createFuncionalidadeDTO() {
        return new FuncionalidadeDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InCadastrarAlterarPerfil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/PerfilService", name = "inCadastrarAlterarPerfil")
    public JAXBElement<InCadastrarAlterarPerfil> createInCadastrarAlterarPerfil(InCadastrarAlterarPerfil value) {
        return new JAXBElement<InCadastrarAlterarPerfil>(_InCadastrarAlterarPerfil_QNAME, InCadastrarAlterarPerfil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutCadastrarAlterarPerfil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/PerfilService", name = "status")
    public JAXBElement<OutCadastrarAlterarPerfil> createStatus(OutCadastrarAlterarPerfil value) {
        return new JAXBElement<OutCadastrarAlterarPerfil>(_Status_QNAME, OutCadastrarAlterarPerfil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InPesquisarPelaEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/PerfilService", name = "inPesquisarPerfis")
    public JAXBElement<InPesquisarPelaEmpresa> createInPesquisarPerfis(InPesquisarPelaEmpresa value) {
        return new JAXBElement<InPesquisarPelaEmpresa>(_InPesquisarPerfis_QNAME, InPesquisarPelaEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutPesquisarPerfis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/PerfilService", name = "perfis")
    public JAXBElement<OutPesquisarPerfis> createPerfis(OutPesquisarPerfis value) {
        return new JAXBElement<OutPesquisarPerfis>(_Perfis_QNAME, OutPesquisarPerfis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IspoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/PerfilService", name = "IspoException")
    public JAXBElement<IspoException> createIspoException(IspoException value) {
        return new JAXBElement<IspoException>(_IspoException_QNAME, IspoException.class, null, value);
    }

}
