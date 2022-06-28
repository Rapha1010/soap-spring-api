//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.06.25 às 03:28:43 PM BRT 
//


package crcind.wsdl;

import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddIntegerResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addIntegerResult"
})
@XmlRootElement(name = "DivideIntegerResponse")
public class DivIntegerResponse {

    @XmlElement(name = "DivideIntegerResult")
    protected long addIntegerResult;

    /**
     * Obtém o valor da propriedade addIntegerResult.
     * 
     */
    public long getAddIntegerResult() {
        return addIntegerResult;
    }

    /**
     * Define o valor da propriedade addIntegerResult.
     * 
     */
    public void setAddIntegerResult(long value) {
        this.addIntegerResult = value;
    }

}
