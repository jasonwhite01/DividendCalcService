package com.wls.dividend_calc.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class DividendController {

    @RequestMapping(path = "/dividend", method=RequestMethod.GET)
    public String getDividendGreeting(){
        return "Dividends, Dividends, Dividends.";
    }

    /**
     * TODO:
     * 
     * Implement paths and methods here that are proxies for other "service" objects that actually do dividend calcs
     */
}
