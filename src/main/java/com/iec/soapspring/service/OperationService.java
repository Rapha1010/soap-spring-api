package com.iec.soapspring.service;

import crcind.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class OperationService extends WebServiceGatewaySupport {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public AddIntegerResponse add(String arg1, String arg2){
        AddInteger request = new AddInteger();
        request.setArg1(arg1);
        request.setArg2(arg2);
        logger.info(String.format("Requesting check of Phone Number for %s with license key %s", arg1, arg2));

        AddIntegerResponse response = (AddIntegerResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://www.crcind.com/csp/samples/SOAP.Demo.CLS",
                        request,
                        new SoapActionCallback("http://tempuri.org/SOAP.Demo.AddInteger"));

        return response;
    }

    public DivIntegerResponse div(String arg1, String arg2){
        DivInteger request = new DivInteger();
        request.setArg1(arg1);
        request.setArg2(arg2);
        logger.info(String.format("Requesting check of Phone Number for %s with license key %s", arg1, arg2));

        DivIntegerResponse response = (DivIntegerResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://www.crcind.com/csp/samples/SOAP.Demo.CLS",
                        request,
                        new SoapActionCallback("http://tempuri.org/SOAP.Demo.DivideInteger"));

        return response;
    }

    public FindPersonResponse findPerson(String id){
        FindPerson request = new FindPerson();
        request.setId(id);

        FindPersonResponse response = (FindPersonResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://www.crcind.com/csp/samples/SOAP.Demo.CLS",
                        request,
                        new SoapActionCallback("http://tempuri.org/SOAP.Demo.FindPerson"));

        return response;
    }
}
