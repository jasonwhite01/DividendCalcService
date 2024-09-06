package com.wls.dividendCalcService.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppErrorController implements ErrorController {

    @RequestMapping(path = "/error", method=RequestMethod.GET)    
    public String getErrorString1(){
        return "Bad stuff happened.";
    }
}
