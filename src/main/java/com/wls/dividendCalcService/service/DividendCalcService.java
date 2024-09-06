package com.wls.dividendcalcservice.service;

import com.wls.dividendcalcservice.model.DividendCalcDTO;

public class DividendCalcService {

    DividendCalcDTO divCalcDTO;

    public DividendCalcService(DividendCalcDTO dividendCalcDTO) {
        this.divCalcDTO = dividendCalcDTO;
    }

    /**
     * Calculates the amount of investment required to generate the target monthly income amount and sets the same in the DTO which is ultimately returned as JSON to the caller of the API.
     * @param incomeTarget
     */
    public void calcTotalInvestmentRequired(float incomeTarget) {
        this.divCalcDTO.setTotalInvestmentRequired(this.divCalcDTO.getSymbolPrice() * (incomeTarget/(divCalcDTO.getDividendAmount()/3)));
    }
    
}
