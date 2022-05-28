package com.coralogix.calculator.model;


import javax.persistence.*;

@Entity()
public class ExchangeRate {


     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     @Column()
     public Integer id;

     @Column()
     public String originCurrency;


     @Column()
     public String finalCurrency;

     @Column()
     public String date;


     @Column()
     public String valor;


}
