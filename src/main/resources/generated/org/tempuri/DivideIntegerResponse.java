//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.06.29 às 03:32:59 PM BRT 
//


package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DivideIntegerResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "divideIntegerResult"
})
@XmlRootElement(name = "DivideIntegerResponse")
public class DivideIntegerResponse {

    @XmlElement(name = "DivideIntegerResult", required = true)
    protected String divideIntegerResult;

    /**
     * Obtém o valor da propriedade divideIntegerResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivideIntegerResult() {
        return divideIntegerResult;
    }

    /**
     * Define o valor da propriedade divideIntegerResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivideIntegerResult(String value) {
        this.divideIntegerResult = value;
    }

}
