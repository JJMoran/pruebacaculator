package com.coralogix.calculator;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.model.request.Currency;
import com.coralogix.calculator.services.AddService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ExchangeRate")
public class AddController {

    @Autowired
    AddService addService;

    public AddController(AddService addService) {
        this.addService = addService;
    }

    public Result getExchangeRate(@RequestBody Currency requestCurrency) {
        return addService.add(requestCurrency);
    }



}
