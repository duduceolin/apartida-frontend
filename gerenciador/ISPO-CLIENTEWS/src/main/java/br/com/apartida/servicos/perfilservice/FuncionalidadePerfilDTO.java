
package br.com.apartida.servicos.perfilservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de funcionalidadePerfilDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="funcionalidadePerfilDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="icone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idFuncionalidade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "funcionalidadePerfilDTO", propOrder = {
    "icone",
    "idFuncionalidade",
    "nome",
    "url"
})
public class FuncionalidadePerfilDTO {

    protected String icone;
    protected Long idFuncionalidade;
    protected String nome;
    protected String url;

    /**
     * Obtém o valor da propriedade icone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcone() {
        return icone;
    }

    /**
     * Define o valor da propriedade icone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcone(String value) {
        this.icone = value;
    }

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
