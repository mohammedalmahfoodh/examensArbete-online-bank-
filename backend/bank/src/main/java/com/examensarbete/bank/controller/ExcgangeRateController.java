package com.examensarbete.bank.controller;

import com.examensarbete.bank.domain.domain.exchange.ForeignExchangeRates;
import com.examensarbete.bank.service.UserServiceImpl.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ExcgangeRateController {


    @Autowired
    ExchangeService exchangeService;

    @GetMapping("/rates")
    public String getRrates(Model model) {
        Map<String, String> ratesMap = new HashMap<String, String>();

        ForeignExchangeRates foreignExchangeRates = exchangeService.getRates();


        ratesMap.put("DKK", foreignExchangeRates.getRates().getDkk());
        ratesMap.put("USD", foreignExchangeRates.getRates().getUsd());
        ratesMap.put("SEK", foreignExchangeRates.getRates().getSek());
        ratesMap.put("JPY", foreignExchangeRates.getRates().getJpy());
        ratesMap.put("GBP", foreignExchangeRates.getRates().getGbp());


        ratesMap.put("CHF", foreignExchangeRates.getRates().getChf());
        ratesMap.put("RUB", foreignExchangeRates.getRates().getRub());
        ratesMap.put("AUD", foreignExchangeRates.getRates().getAud());
        ratesMap.put("BRL", foreignExchangeRates.getRates().getBrl());

        ratesMap.put("NOK", foreignExchangeRates.getRates().getNok());
        ratesMap.put("PLN", foreignExchangeRates.getRates().getPln());
        ratesMap.put("CAD", foreignExchangeRates.getRates().getCad());






        model.addAttribute("foreignExchangeRates", foreignExchangeRates);
        model.addAttribute("ratesMap", ratesMap);
        return "rates";
    }
}
