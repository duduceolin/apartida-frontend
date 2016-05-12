
package br.com.isports.clientews.usuarioservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de validarUsuarioResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="validarUsuarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuarioValido" type="{http://isoccer.com.br/servicos/UsuarioService}outValidarUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarUsuarioResponse", propOrder = {
    "usuarioValido"
})
public class ValidarUsuarioResponse {

    protected OutValidarUsuario usuarioValido;

    /**
     * Obtém o valor da propriedade usuarioValido.
     * 
     * @return
     *     possible object is
     *     {@link OutValidarUsuario }
     *     
     */
    public OutValidarUsuario getUsuarioValido() {
        return usuarioValido;
    }

    /**
     * Define o valor da propriedade usuarioValido.
     * 
     * @param value
     *     allowed object is
     *     {@link OutValidarUsuario }
     *     
     */
    public void setUsuarioValido(OutValidarUsuario value) {
        this.usuarioValido = value;
    }

}
