
package br.com.apartida.servicos.funcionalidadeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inPesquisarFuncionalidadesPlano complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inPesquisarFuncionalidadesPlano">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPlano" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inPesquisarFuncionalidadesPlano", propOrder = {
    "idPlano"
})
public class InPesquisarFuncionalidadesPlano {

    protected long idPlano;

    /**
     * Obtém o valor da propriedade idPlano.
     * 
     */
    public long getIdPlano() {
        return idPlano;
    }

    /**
     * Define o valor da propriedade idPlano.
     * 
     */
    public void setIdPlano(long value) {
        this.idPlano = value;
    }

}
