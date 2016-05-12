
package br.com.isports.clientews.usuarioservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.isports.clientews.usuarioservice package. 
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

    private final static QName _BuscarTotalUsuarioResponse_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "buscarTotalUsuarioResponse");
    private final static QName _ValidarUsuarioResponse_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "validarUsuarioResponse");
    private final static QName _CadastrarUsuarioResponse_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "cadastrarUsuarioResponse");
    private final static QName _BuscarTotalUsuario_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "buscarTotalUsuario");
    private final static QName _BuscarUsuarioDTO_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "BuscarUsuarioDTO");
    private final static QName _CadastrarUsuario_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "cadastrarUsuario");
    private final static QName _InValidarUsuario_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "InValidarUsuario");
    private final static QName _ValidarUsuario_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "validarUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.isports.clientews.usuarioservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link InValidarUsuario }
     * 
     */
    public InValidarUsuario createInValidarUsuario() {
        return new InValidarUsuario();
    }

    /**
     * Create an instance of {@link CadastrarUsuario }
     * 
     */
    public CadastrarUsuario createCadastrarUsuario() {
        return new CadastrarUsuario();
    }

    /**
     * Create an instance of {@link BuscarTotalUsuario }
     * 
     */
    public BuscarTotalUsuario createBuscarTotalUsuario() {
        return new BuscarTotalUsuario();
    }

    /**
     * Create an instance of {@link BuscarUsuarioDTO }
     * 
     */
    public BuscarUsuarioDTO createBuscarUsuarioDTO() {
        return new BuscarUsuarioDTO();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link CadastrarUsuarioResponse }
     * 
     */
    public CadastrarUsuarioResponse createCadastrarUsuarioResponse() {
        return new CadastrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarTotalUsuarioResponse }
     * 
     */
    public BuscarTotalUsuarioResponse createBuscarTotalUsuarioResponse() {
        return new BuscarTotalUsuarioResponse();
    }

    /**
     * Create an instance of {@link OutValidarUsuario }
     * 
     */
    public OutValidarUsuario createOutValidarUsuario() {
        return new OutValidarUsuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTotalUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "buscarTotalUsuarioResponse")
    public JAXBElement<BuscarTotalUsuarioResponse> createBuscarTotalUsuarioResponse(BuscarTotalUsuarioResponse value) {
        return new JAXBElement<BuscarTotalUsuarioResponse>(_BuscarTotalUsuarioResponse_QNAME, BuscarTotalUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "validarUsuarioResponse")
    public JAXBElement<ValidarUsuarioResponse> createValidarUsuarioResponse(ValidarUsuarioResponse value) {
        return new JAXBElement<ValidarUsuarioResponse>(_ValidarUsuarioResponse_QNAME, ValidarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "cadastrarUsuarioResponse")
    public JAXBElement<CadastrarUsuarioResponse> createCadastrarUsuarioResponse(CadastrarUsuarioResponse value) {
        return new JAXBElement<CadastrarUsuarioResponse>(_CadastrarUsuarioResponse_QNAME, CadastrarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTotalUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "buscarTotalUsuario")
    public JAXBElement<BuscarTotalUsuario> createBuscarTotalUsuario(BuscarTotalUsuario value) {
        return new JAXBElement<BuscarTotalUsuario>(_BuscarTotalUsuario_QNAME, BuscarTotalUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "BuscarUsuarioDTO")
    public JAXBElement<BuscarUsuarioDTO> createBuscarUsuarioDTO(BuscarUsuarioDTO value) {
        return new JAXBElement<BuscarUsuarioDTO>(_BuscarUsuarioDTO_QNAME, BuscarUsuarioDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "cadastrarUsuario")
    public JAXBElement<CadastrarUsuario> createCadastrarUsuario(CadastrarUsuario value) {
        return new JAXBElement<CadastrarUsuario>(_CadastrarUsuario_QNAME, CadastrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InValidarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "InValidarUsuario")
    public JAXBElement<InValidarUsuario> createInValidarUsuario(InValidarUsuario value) {
        return new JAXBElement<InValidarUsuario>(_InValidarUsuario_QNAME, InValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "validarUsuario")
    public JAXBElement<ValidarUsuario> createValidarUsuario(ValidarUsuario value) {
        return new JAXBElement<ValidarUsuario>(_ValidarUsuario_QNAME, ValidarUsuario.class, null, value);
    }

}
