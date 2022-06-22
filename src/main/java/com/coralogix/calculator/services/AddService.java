package com.coralogix.calculator.services;

import com.coralogix.calculator.model.ExchangeRate;
import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.model.request.Currency;
import com.coralogix.calculator.model.response.Product;
import com.coralogix.calculator.proxy.GitHubService;
import com.coralogix.calculator.repository.CurrencyRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class AddService {

    @Autowired
    CurrencyRepository currencyRepository;

    GitHubService gitHubService;

    public AddService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public Result add(Currency a ) {

        ExchangeRate exchangeRate =  new ExchangeRate();

        exchangeRate.originCurrency = a.getOriginCurrency();
        exchangeRate.finalCurrency = a.getFinalCurrency();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://localhost:8080/fixer/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        gitHubService = retrofit.create(GitHubService.class);


        Call<Product> callSync = gitHubService.listRepos(a.getOriginCurrency(),a.getFinalCurrency());


        Response<Product> response = null;
        try {
            response = callSync.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Product product = response.body();
        exchangeRate.date = product.getDate();
        exchangeRate.valor = product.getRates().get(a.getFinalCurrency());


        currencyRepository.save(exchangeRate);
        return new Result("OK");
    }
}
