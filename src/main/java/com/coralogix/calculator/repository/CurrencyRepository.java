package com.coralogix.calculator.repository;

import com.coralogix.calculator.model.ExchangeRate;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<ExchangeRate,Integer> {
}
