package com.wls.dividendcalcservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.wls.dividendcalcservice.model.DividendCalcDTO;
import com.wls.dividendcalcservice.service.DividendCalcService;

@RestController
public class DividendController {

    @GetMapping(path = "/dividend")
    public String getDividendGreeting(){
        return "Dividends, Dividends, Dividends.";
    }

    /**
     * Calculates and returns the amount of investment required to generate the target monthly income amount.
     *  
     * @param symbol
     * @param symbolPrice
     * @param incomeTarget
     * @param dividendAmount
     * @return ResponseEntity - the JSON response
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @GetMapping(path = "/dividend/calc/income/monthly/target")
    @ResponseBody
    public ResponseEntity getDividendInvestmentRequiredForTarget(
        @RequestParam(name = "symbol") String symbol, 
        @RequestParam(name = "symbolprice") String symbolPrice,
        @RequestParam(name = "target") String incomeTarget,
        @RequestParam(name = "amount") String dividendAmount){

        DividendCalcDTO divCalcDTO = new DividendCalcDTO(symbol, Float.parseFloat(symbolPrice), Float.parseFloat(dividendAmount), 0f);
        DividendCalcService divCalcService = new DividendCalcService(divCalcDTO);
        divCalcService.calcTotalInvestmentRequired(Float.parseFloat(incomeTarget));

        return new ResponseEntity(divCalcDTO, HttpStatus.OK);
    }
}
