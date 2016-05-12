
package br.com.isports.clientews.usuarioservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de validarUsuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="validarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inValidarUsuario" type="{http://isoccer.com.br/servicos/UsuarioService}inValidarUsuario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarUsuario", propOrder = {
    "inValidarUsuario"
})
public class ValidarUsuario {

    @XmlElement(required = true)
    protected InValidarUsuario inValidarUsuario;

    /**
     * Obtém o valor da propriedade inValidarUsuario.
     * 
     * @return
     *     possible object is
     *     {@link InValidarUsuario }
     *     
     */
    public InValidarUsuario getInValidarUsuario() {
        return inValidarUsuario;
    }

    /**
     * Define o valor da propriedade inValidarUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link InValidarUsuario }
     *     
     */
    public void setInValidarUsuario(InValidarUsuario value) {
        this.inValidarUsuario = value;
    }

}
