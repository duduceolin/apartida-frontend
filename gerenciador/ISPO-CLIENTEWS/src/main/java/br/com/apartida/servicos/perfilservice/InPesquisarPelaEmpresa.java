
package br.com.apartida.servicos.perfilservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inPesquisarPelaEmpresa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inPesquisarPelaEmpresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEmpresa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inPesquisarPelaEmpresa", propOrder = {
    "idEmpresa"
})
public class InPesquisarPelaEmpresa {

    protected long idEmpresa;

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

}
