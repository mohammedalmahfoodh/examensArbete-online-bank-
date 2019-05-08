package com.examensarbete.bank.domain.domain.exchange;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForeignExchangeRates {

   private Rate rates;
   private String base;
   private Date date;

    public ForeignExchangeRates() {
        rates=new Rate();
        this.base = "";
        this.date = new Date();
    }

    public Rate getRates() {
        return rates;
    }

    public void setRates(Rate rates) {
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
