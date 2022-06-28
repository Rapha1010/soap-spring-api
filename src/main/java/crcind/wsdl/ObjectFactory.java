//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.06.25 às 03:28:43 PM BRT 
//


package crcind.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddIntegerResponse }
     * 
     */
    public AddIntegerResponse createAddIntegerResponse() {
        return new AddIntegerResponse();
    }

    /**
     * Create an instance of {@link AddInteger }
     * 
     */
    public AddInteger createAddInteger() {
        return new AddInteger();
    }

    /**
     * Create an instance of {@link DivIntegerResponse }
     *
     */
    public DivIntegerResponse createDivIntegerResponse() {
        return new DivIntegerResponse();
    }

    /**
     * Create an instance of {@link AddInteger }
     *
     */
    public DivInteger createDivInteger() {
        return new DivInteger();
    }

    /**
     * Create an instance of {@link FindPersonResponse }
     *
     */
    public FindPersonResponse createFindPersonResponse() {
        return new FindPersonResponse();
    }

    /**
     * Create an instance of {@link FindPerson }
     *
     */
    public FindPerson createFindPerson() {
        return new FindPerson();
    }

}
