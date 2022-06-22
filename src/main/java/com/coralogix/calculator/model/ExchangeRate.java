package com.coralogix.calculator.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity()
@Table(name="ExchangeRate")
public class ExchangeRate  implements Serializable {


     private static final long serialVersionUID = 1L;


     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     public Long id;

     @Column(name="origin_currency")
     public String originCurrency;


     @Column(name="final_currency")
     public String finalCurrency;

     public String date;


     public String valor;


}
