
package br.com.isoccer.servicos.usuarioservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inValidarUsuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inValidarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosValidarUsuario" type="{http://isoccer.com.br/servicos/UsuarioService}validarUsuarioDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inValidarUsuario", propOrder = {
    "dadosValidarUsuario"
})
public class InValidarUsuario {

    @XmlElement(required = true)
    protected ValidarUsuarioDTO dadosValidarUsuario;

    /**
     * Obtém o valor da propriedade dadosValidarUsuario.
     * 
     * @return
     *     possible object is
     *     {@link ValidarUsuarioDTO }
     *     
     */
    public ValidarUsuarioDTO getDadosValidarUsuario() {
        return dadosValidarUsuario;
    }

    /**
     * Define o valor da propriedade dadosValidarUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidarUsuarioDTO }
     *     
     */
    public void setDadosValidarUsuario(ValidarUsuarioDTO value) {
        this.dadosValidarUsuario = value;
    }

}
