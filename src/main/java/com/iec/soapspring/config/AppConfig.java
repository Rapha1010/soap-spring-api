package com.iec.soapspring.config;

import com.iec.soapspring.service.OperationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class AppConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("crcind.wsdl");
        return marshaller;
    }

    @Bean
    public OperationService phoneReturnClient(Jaxb2Marshaller marshaller){
        OperationService client = new OperationService();
        client.setDefaultUri("https://www.crcind.com/csp/samples/SOAP.Demo.cls");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
