package com.examensarbete.bank.controller;

import com.examensarbete.bank.domain.domain.exchange.ForeignExchangeRates;
import com.examensarbete.bank.service.UserServiceImpl.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ExchangeService exchangeService;
    @GetMapping("/exchangrates")
public ForeignExchangeRates getRrates(){

        return exchangeService.getRates();
}
}
