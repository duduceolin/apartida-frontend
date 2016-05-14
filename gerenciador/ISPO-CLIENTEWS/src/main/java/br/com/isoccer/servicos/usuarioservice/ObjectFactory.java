
package br.com.isoccer.servicos.usuarioservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.isoccer.servicos.usuarioservice package. 
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

    private final static QName _UsuarioValido_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "usuarioValido");
    private final static QName _ValidarUsuarioDTO_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "ValidarUsuarioDTO");
    private final static QName _InValidarUsuario_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "inValidarUsuario");
    private final static QName _IspoException_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "IspoException");
    private final static QName _InBuscarUsuario_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "inBuscarUsuario");
    private final static QName _BuscarUsuarioDTO_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "BuscarUsuarioDTO");
    private final static QName _Usuario_QNAME = new QName("http://isoccer.com.br/servicos/UsuarioService", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.isoccer.servicos.usuarioservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutBuscarUsuario }
     * 
     */
    public OutBuscarUsuario createOutBuscarUsuario() {
        return new OutBuscarUsuario();
    }

    /**
     * Create an instance of {@link InBuscarUsuario }
     * 
     */
    public InBuscarUsuario createInBuscarUsuario() {
        return new InBuscarUsuario();
    }

    /**
     * Create an instance of {@link IspoException }
     * 
     */
    public IspoException createIspoException() {
        return new IspoException();
    }

    /**
     * Create an instance of {@link BuscarUsuarioDTO }
     * 
     */
    public BuscarUsuarioDTO createBuscarUsuarioDTO() {
        return new BuscarUsuarioDTO();
    }

    /**
     * Create an instance of {@link InValidarUsuario }
     * 
     */
    public InValidarUsuario createInValidarUsuario() {
        return new InValidarUsuario();
    }

    /**
     * Create an instance of {@link ValidarUsuarioDTO }
     * 
     */
    public ValidarUsuarioDTO createValidarUsuarioDTO() {
        return new ValidarUsuarioDTO();
    }

    /**
     * Create an instance of {@link OutValidarUsuario }
     * 
     */
    public OutValidarUsuario createOutValidarUsuario() {
        return new OutValidarUsuario();
    }

    /**
     * Create an instance of {@link PerfilDTO }
     * 
     */
    public PerfilDTO createPerfilDTO() {
        return new PerfilDTO();
    }

    /**
     * Create an instance of {@link UsuarioDTO }
     * 
     */
    public UsuarioDTO createUsuarioDTO() {
        return new UsuarioDTO();
    }

    /**
     * Create an instance of {@link EmpresaDTO }
     * 
     */
    public EmpresaDTO createEmpresaDTO() {
        return new EmpresaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutValidarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "usuarioValido")
    public JAXBElement<OutValidarUsuario> createUsuarioValido(OutValidarUsuario value) {
        return new JAXBElement<OutValidarUsuario>(_UsuarioValido_QNAME, OutValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "ValidarUsuarioDTO")
    public JAXBElement<ValidarUsuarioDTO> createValidarUsuarioDTO(ValidarUsuarioDTO value) {
        return new JAXBElement<ValidarUsuarioDTO>(_ValidarUsuarioDTO_QNAME, ValidarUsuarioDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InValidarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "inValidarUsuario")
    public JAXBElement<InValidarUsuario> createInValidarUsuario(InValidarUsuario value) {
        return new JAXBElement<InValidarUsuario>(_InValidarUsuario_QNAME, InValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IspoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "IspoException")
    public JAXBElement<IspoException> createIspoException(IspoException value) {
        return new JAXBElement<IspoException>(_IspoException_QNAME, IspoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InBuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "inBuscarUsuario")
    public JAXBElement<InBuscarUsuario> createInBuscarUsuario(InBuscarUsuario value) {
        return new JAXBElement<InBuscarUsuario>(_InBuscarUsuario_QNAME, InBuscarUsuario.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OutBuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isoccer.com.br/servicos/UsuarioService", name = "usuario")
    public JAXBElement<OutBuscarUsuario> createUsuario(OutBuscarUsuario value) {
        return new JAXBElement<OutBuscarUsuario>(_Usuario_QNAME, OutBuscarUsuario.class, null, value);
    }

}
