package com.examensarbete.bank.service.UserServiceImpl;

import com.examensarbete.bank.domain.domain.exchange.ForeignExchangeRates;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExchangeService {
    RestTemplate restTemplate = new RestTemplate();



    public ForeignExchangeRates getRates(){
        String url = "https://api.exchangeratesapi.io/latest";
        ForeignExchangeRates foreignExchangeRates = restTemplate.getForObject(url, ForeignExchangeRates.class);
        if (foreignExchangeRates!=null){

            return foreignExchangeRates;
        }

        return null;

    }



}
