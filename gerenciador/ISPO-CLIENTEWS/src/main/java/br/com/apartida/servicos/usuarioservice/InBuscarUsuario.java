
package br.com.apartida.servicos.usuarioservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inBuscarUsuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inBuscarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosBuscarUsuario" type="{http://apartida.com.br/servicos/UsuarioService}buscarUsuarioDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inBuscarUsuario", propOrder = {
    "dadosBuscarUsuario"
})
public class InBuscarUsuario {

    @XmlElement(required = true)
    protected BuscarUsuarioDTO dadosBuscarUsuario;

    /**
     * Obtém o valor da propriedade dadosBuscarUsuario.
     * 
     * @return
     *     possible object is
     *     {@link BuscarUsuarioDTO }
     *     
     */
    public BuscarUsuarioDTO getDadosBuscarUsuario() {
        return dadosBuscarUsuario;
    }

    /**
     * Define o valor da propriedade dadosBuscarUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscarUsuarioDTO }
     *     
     */
    public void setDadosBuscarUsuario(BuscarUsuarioDTO value) {
        this.dadosBuscarUsuario = value;
    }

}
