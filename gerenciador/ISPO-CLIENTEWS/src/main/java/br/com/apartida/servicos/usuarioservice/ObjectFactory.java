
package br.com.apartida.servicos.usuarioservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.apartida.servicos.usuarioservice package. 
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

    private final static QName _Usuario_QNAME = new QName("http://apartida.com.br/servicos/UsuarioService", "usuario");
    private final static QName _BuscarUsuarioDTO_QNAME = new QName("http://apartida.com.br/servicos/UsuarioService", "BuscarUsuarioDTO");
    private final static QName _IspoException_QNAME = new QName("http://apartida.com.br/servicos/UsuarioService", "IspoException");
    private final static QName _InBuscarUsuario_QNAME = new QName("http://apartida.com.br/servicos/UsuarioService", "inBuscarUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.apartida.servicos.usuarioservice
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
     * Create an instance of {@link PerfilDTO }
     * 
     */
    public PerfilDTO createPerfilDTO() {
        return new PerfilDTO();
    }

    /**
     * Create an instance of {@link FuncionalidadeDTO }
     * 
     */
    public FuncionalidadeDTO createFuncionalidadeDTO() {
        return new FuncionalidadeDTO();
    }

    /**
     * Create an instance of {@link UsuarioDTO }
     * 
     */
    public UsuarioDTO createUsuarioDTO() {
        return new UsuarioDTO();
    }

    /**
     * Create an instance of {@link PlanoDTO }
     * 
     */
    public PlanoDTO createPlanoDTO() {
        return new PlanoDTO();
    }

    /**
     * Create an instance of {@link EmpresaDTO }
     * 
     */
    public EmpresaDTO createEmpresaDTO() {
        return new EmpresaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutBuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/UsuarioService", name = "usuario")
    public JAXBElement<OutBuscarUsuario> createUsuario(OutBuscarUsuario value) {
        return new JAXBElement<OutBuscarUsuario>(_Usuario_QNAME, OutBuscarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/UsuarioService", name = "BuscarUsuarioDTO")
    public JAXBElement<BuscarUsuarioDTO> createBuscarUsuarioDTO(BuscarUsuarioDTO value) {
        return new JAXBElement<BuscarUsuarioDTO>(_BuscarUsuarioDTO_QNAME, BuscarUsuarioDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IspoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/UsuarioService", name = "IspoException")
    public JAXBElement<IspoException> createIspoException(IspoException value) {
        return new JAXBElement<IspoException>(_IspoException_QNAME, IspoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InBuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apartida.com.br/servicos/UsuarioService", name = "inBuscarUsuario")
    public JAXBElement<InBuscarUsuario> createInBuscarUsuario(InBuscarUsuario value) {
        return new JAXBElement<InBuscarUsuario>(_InBuscarUsuario_QNAME, InBuscarUsuario.class, null, value);
    }

}
