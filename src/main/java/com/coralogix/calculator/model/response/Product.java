package com.coralogix.calculator.model.response;

import java.io.Serializable;
import java.util.Map;

public class Product implements Serializable {

     private static final long serialVersionUID = -4062184960852808108L;


     private String date;

     private Map<String, String> rate;

     public String getDate() {
          return date;
     }

     public void setDate(String date) {
          this.date = date;
     }

     public Map<String, String> getRate() {
          return rate;
     }

     public void setRate(Map<String, String> rate) {
          this.rate = rate;
     }
}
