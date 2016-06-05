
package br.com.apartida.servicos.funcionalidadeservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de outPesquisarFuncionalidadesPlano complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="outPesquisarFuncionalidadesPlano">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="menu" type="{http://apartida.com.br/servicos/FuncionalidadeService}funcionalidadeToMenuDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outPesquisarFuncionalidadesPlano", propOrder = {
    "menu"
})
public class OutPesquisarFuncionalidadesPlano {

    @XmlElement(nillable = true)
    protected List<FuncionalidadeToMenuDTO> menu;

    /**
     * Gets the value of the menu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuncionalidadeToMenuDTO }
     * 
     * 
     */
    public List<FuncionalidadeToMenuDTO> getMenu() {
        if (menu == null) {
            menu = new ArrayList<FuncionalidadeToMenuDTO>();
        }
        return this.menu;
    }

}
