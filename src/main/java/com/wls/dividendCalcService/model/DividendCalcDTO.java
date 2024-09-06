package com.wls.dividendcalcservice.model;


public class DividendCalcDTO {

    private final String symbol;  
    private final Float symbolPrice;
    private final Float dividendAmount;
    private Float totalInvestmentRequired; 

    public DividendCalcDTO(String symbol, Float symbolPrice, Float dividendAmount, Float totalInvestmentRequired) {
        this.symbol = symbol;
        this.symbolPrice = symbolPrice;
        this.dividendAmount = dividendAmount;
        this.totalInvestmentRequired = totalInvestmentRequired;
    }

    public String getSymbol() {
        return symbol;
    }

    public Float getSymbolPrice() {
        return symbolPrice;
    }

    public Float getDividendAmount() {
        return dividendAmount;
    }    

    public Float getTotalInvestmentRequired() {
        return totalInvestmentRequired;
    }

    public void setTotalInvestmentRequired(float totalInvestmentRequired) {
        this.totalInvestmentRequired = totalInvestmentRequired;
    }    
}
