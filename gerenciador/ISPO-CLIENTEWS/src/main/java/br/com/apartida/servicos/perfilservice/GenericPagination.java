
package br.com.apartida.servicos.perfilservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de genericPagination complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="genericPagination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primeiro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tamanho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericPagination", propOrder = {
    "primeiro",
    "tamanho"
})
@XmlSeeAlso({
    InPesquisarPelaEmpresa.class
})
public class GenericPagination {

    protected int primeiro;
    protected int tamanho;

    /**
     * Obtém o valor da propriedade primeiro.
     * 
     */
    public int getPrimeiro() {
        return primeiro;
    }

    /**
     * Define o valor da propriedade primeiro.
     * 
     */
    public void setPrimeiro(int value) {
        this.primeiro = value;
    }

    /**
     * Obtém o valor da propriedade tamanho.
     * 
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Define o valor da propriedade tamanho.
     * 
     */
    public void setTamanho(int value) {
        this.tamanho = value;
    }

}
