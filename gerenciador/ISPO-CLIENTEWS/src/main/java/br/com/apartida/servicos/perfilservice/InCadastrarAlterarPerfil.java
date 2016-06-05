
package br.com.apartida.servicos.perfilservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inCadastrarAlterarPerfil complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inCadastrarAlterarPerfil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idEmpresa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acessos" type="{http://apartida.com.br/servicos/PerfilService}funcionalidadeDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inCadastrarAlterarPerfil", propOrder = {
    "id",
    "idEmpresa",
    "nome",
    "admin",
    "acessos"
})
public class InCadastrarAlterarPerfil {

    protected long id;
    protected long idEmpresa;
    @XmlElement(required = true)
    protected String nome;
    protected boolean admin;
    @XmlElement(nillable = true)
    protected List<FuncionalidadeDTO> acessos;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade idEmpresa.
     * 
     */
    public long getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Define o valor da propriedade idEmpresa.
     * 
     */
    public void setIdEmpresa(long value) {
        this.idEmpresa = value;
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
     * Obtém o valor da propriedade admin.
     * 
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Define o valor da propriedade admin.
     * 
     */
    public void setAdmin(boolean value) {
        this.admin = value;
    }

    /**
     * Gets the value of the acessos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acessos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcessos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuncionalidadeDTO }
     * 
     * 
     */
    public List<FuncionalidadeDTO> getAcessos() {
        if (acessos == null) {
            acessos = new ArrayList<FuncionalidadeDTO>();
        }
        return this.acessos;
    }

}
