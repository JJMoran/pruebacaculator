package com.coralogix.calculator.model.request;

public class Currency {

    private String originCurrency;
    private String finalCurrency;

    public Currency(String originCurrency, String finalCurrency) {
        this.originCurrency = originCurrency;
        this.finalCurrency = finalCurrency;
    }

    public String getOriginCurrency() {
        return originCurrency;
    }

    public void setOriginCurrency(String originCurrency) {
        this.originCurrency = originCurrency;
    }

    public String getFinalCurrency() {
        return finalCurrency;
    }

    public void setFinalCurrency(String finalCurrency) {
        this.finalCurrency = finalCurrency;
    }
}
