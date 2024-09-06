package com.wls.dividendcalcservice.service;

import com.wls.dividendcalcservice.model.DividendCalcDTO;

public class DividendCalcService {

    DividendCalcDTO divCalcDTO;

    public DividendCalcService(DividendCalcDTO dividendCalcDTO) {
        this.divCalcDTO = dividendCalcDTO;
    }

    public void calcTotalInvestmentRequired(float incomeTarget) {
        this.divCalcDTO.setTotalInvestmentRequired(this.divCalcDTO.getSymbolPrice() * (incomeTarget/(divCalcDTO.getDividendAmount()/3)));
    }
    
}
