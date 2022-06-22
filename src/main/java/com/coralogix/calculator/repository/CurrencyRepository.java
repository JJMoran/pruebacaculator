package com.coralogix.calculator.repository;

import com.coralogix.calculator.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends JpaRepository<ExchangeRate,Long> {
}
