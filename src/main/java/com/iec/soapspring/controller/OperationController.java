package com.iec.soapspring.controller;

import com.iec.soapspring.service.OperationService;
import crcind.wsdl.AddIntegerResponse;
import crcind.wsdl.DivIntegerResponse;
import crcind.wsdl.FindPersonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class OperationController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OperationService opService;

    @GetMapping(path = "add/{arg1}/{args2}")
    public @ResponseBody AddIntegerResponse addInteger(@PathVariable String arg1, @PathVariable String args2){
        logger.info("Executed addInteger");
        AddIntegerResponse response = opService.add(arg1, args2);
        return response;
    }

    @GetMapping(path = "div/{arg1}/{args2}")
    public @ResponseBody DivIntegerResponse divInteger(@PathVariable String arg1, @PathVariable String args2){
        logger.info("Executed divInteger");
        DivIntegerResponse response = opService.div(arg1, args2);
        return response;
    }

    @GetMapping(path = "find-person/{arg1}")
    public @ResponseBody FindPersonResponse findPerson(@PathVariable String arg1){
        logger.info("Executed divInteger");
        FindPersonResponse response = opService.findPerson(arg1);
        return response;
    }
}

