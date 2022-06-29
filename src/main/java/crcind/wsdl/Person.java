//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2022.06.29 �s 03:32:59 PM BRT 
//


package crcind.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Person complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Home" type="{http://tempuri.org}Address" minOccurs="0"/>
 *         &lt;element name="Office" type="{http://tempuri.org}Address" minOccurs="0"/>
 *         &lt;element name="Spouse" type="{http://tempuri.org}Person" minOccurs="0"/>
 *         &lt;element name="FavoriteColors" type="{http://tempuri.org}ArrayOfFavoriteColorsItemString" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "name",
    "ssn",
    "dob",
    "home",
    "office",
    "spouse",
    "favoriteColors",
    "age"
})
public class Person {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SSN", required = true)
    protected String ssn;
    @XmlElement(name = "DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "Home")
    protected Address home;
    @XmlElement(name = "Office")
    protected Address office;
    @XmlElement(name = "Spouse")
    protected Person spouse;
    @XmlElement(name = "FavoriteColors")
    protected ArrayOfFavoriteColorsItemString favoriteColors;
    @XmlElement(name = "Age")
    protected Long age;

    /**
     * Obt�m o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obt�m o valor da propriedade ssn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Define o valor da propriedade ssn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Obt�m o valor da propriedade dob.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Define o valor da propriedade dob.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Obt�m o valor da propriedade home.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getHome() {
        return home;
    }

    /**
     * Define o valor da propriedade home.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setHome(Address value) {
        this.home = value;
    }

    /**
     * Obt�m o valor da propriedade office.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOffice() {
        return office;
    }

    /**
     * Define o valor da propriedade office.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOffice(Address value) {
        this.office = value;
    }

    /**
     * Obt�m o valor da propriedade spouse.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getSpouse() {
        return spouse;
    }

    /**
     * Define o valor da propriedade spouse.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setSpouse(Person value) {
        this.spouse = value;
    }

    /**
     * Obt�m o valor da propriedade favoriteColors.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFavoriteColorsItemString }
     *     
     */
    public ArrayOfFavoriteColorsItemString getFavoriteColors() {
        return favoriteColors;
    }

    /**
     * Define o valor da propriedade favoriteColors.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFavoriteColorsItemString }
     *     
     */
    public void setFavoriteColors(ArrayOfFavoriteColorsItemString value) {
        this.favoriteColors = value;
    }

    /**
     * Obt�m o valor da propriedade age.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAge() {
        return age;
    }

    /**
     * Define o valor da propriedade age.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAge(Long value) {
        this.age = value;
    }

}
