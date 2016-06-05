
package br.com.apartida.servicos.perfilservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de outPesquisarPerfis complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="outPesquisarPerfis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="perfis" type="{http://apartida.com.br/servicos/PerfilService}perfilFuncDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outPesquisarPerfis", propOrder = {
    "perfis"
})
public class OutPesquisarPerfis {

    @XmlElement(nillable = true)
    protected List<PerfilFuncDTO> perfis;

    /**
     * Gets the value of the perfis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perfis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerfis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerfilFuncDTO }
     * 
     * 
     */
    public List<PerfilFuncDTO> getPerfis() {
        if (perfis == null) {
            perfis = new ArrayList<PerfilFuncDTO>();
        }
        return this.perfis;
    }

}
