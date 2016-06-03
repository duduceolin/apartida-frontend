
package br.com.apartida.servicos.funcionalidadeservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de funcionalidadeToMenuDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="funcionalidadeToMenuDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFuncionalidade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subFuncionalidades" type="{http://apartida.com.br/servicos/FuncionalidadeService}funcionalidadeToMenuDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionalidadeToMenuDTO", propOrder = {
    "idFuncionalidade",
    "nome",
    "subFuncionalidades",
    "url"
})
public class FuncionalidadeToMenuDTO {

    protected Long idFuncionalidade;
    protected String nome;
    @XmlElement(nillable = true)
    protected List<FuncionalidadeToMenuDTO> subFuncionalidades;
    protected String url;

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

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the subFuncionalidades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subFuncionalidades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubFuncionalidades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuncionalidadeToMenuDTO }
     * 
     * 
     */
    public List<FuncionalidadeToMenuDTO> getSubFuncionalidades() {
        if (subFuncionalidades == null) {
            subFuncionalidades = new ArrayList<FuncionalidadeToMenuDTO>();
        }
        return this.subFuncionalidades;
    }

    /**
     * Obtém o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
