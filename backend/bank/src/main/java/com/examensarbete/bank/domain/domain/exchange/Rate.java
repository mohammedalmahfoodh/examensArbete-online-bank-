package com.examensarbete.bank.domain.domain.exchange;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    @JsonProperty("USD")
    private String usd ;
    @JsonProperty("DKK")
    private String dkk;
    @JsonProperty("GBP")
    private String gbp;

    @JsonProperty("SEK")
    private String sek;

    @JsonProperty("JPY")
    private String jpy;

    @JsonProperty("CHF")
    private String chf;
    @JsonProperty("RUB")
    private String rub;
    @JsonProperty("AUD")
    private String aud;
    @JsonProperty("BRL")
    private String brl;
    @JsonProperty("NOK")
    private String nok;
    @JsonProperty("PLN")
    private String pln;
    @JsonProperty("CAD")
    private String cad;

    public String getNok() {
        return nok;
    }

    public void setNok(String nok) {
        this.nok = nok;
    }

    public String getPln() {
        return pln;
    }

    public void setPln(String pln) {
        this.pln = pln;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public String getChf() {
        return chf;
    }

    public void setChf(String chf) {
        this.chf = chf;
    }

    public String getRub() {
        return rub;
    }

    public void setRub(String rub) {
        this.rub = rub;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public String getBrl() {
        return brl;
    }

    public void setBrl(String brl) {
        this.brl = brl;
    }




    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getDkk() {
        return dkk;
    }

    public void setDkk(String dkk) {
        this.dkk = dkk;
    }

    public String getGbp() {
        return gbp;
    }

    public void setGbp(String gbp) {
        this.gbp = gbp;
    }

    public String getSek() {
        return sek;
    }

    public void setSek(String sek) {
        this.sek = sek;
    }

    public String getJpy() {
        return jpy;
    }

    public void setJpy(String jpy) {
        this.jpy = jpy;
    }
}
