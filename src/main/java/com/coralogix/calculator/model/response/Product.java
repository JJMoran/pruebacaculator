package com.coralogix.calculator.model.response;

import java.io.Serializable;
import java.util.Map;

public class Product implements Serializable {

     private static final long serialVersionUID = -4062184960852808108L;

     private String base;

     private String date;

     private Map<String, String> rates;

     public String getDate() {
          return date;
     }

     public void setDate(String date) {
          this.date = date;
     }

     public Map<String, String> getRates() {
          return rates;
     }

     public void setRates(Map<String, String> rates) {
          this.rates = rates;
     }

     public String getBase() {
          return base;
     }

     public void setBase(String base) {
          this.base = base;
     }
}
