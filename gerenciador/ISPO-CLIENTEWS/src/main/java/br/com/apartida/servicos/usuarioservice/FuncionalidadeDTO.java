
package br.com.apartida.servicos.usuarioservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de funcionalidadeDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="funcionalidadeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFuncionalidade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionalidadeDTO", propOrder = {
    "idFuncionalidade"
})
public class FuncionalidadeDTO {

    protected Long idFuncionalidade;

    /**
     * Obtém o valor da propriedade idFuncionalidade.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdFuncionalidade() {
        return idFuncionalidade;
    }

    /**
     * Define o valor da propriedade idFuncionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdFuncionalidade(Long value) {
        this.idFuncionalidade = value;
    }

}
