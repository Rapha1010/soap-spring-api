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
 *         &lt;element name="Arg1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Arg2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "arg1",
    "arg2"
})
@XmlRootElement(name = "AddInteger")
public class AddInteger {

    @XmlElement(name = "Arg1")
    protected String arg1;
    @XmlElement(name = "Arg2")
    protected String arg2;

    /**
     * Obtém o valor da propriedade arg1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Define o valor da propriedade arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * Obtém o valor da propriedade arg2.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * Define o valor da propriedade arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

}
