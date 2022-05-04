package com.dio.santander.bankline.api.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {

    @Column(name = "conta_number")
    private Long number;
    @Column(name = "conta_balance")
    private Double balance;

    public Conta(Double balance, Long number){
        this.balance = balance;
        this.number = number;
    }
    
    public Long getNumber() {
        return number;
    }
    public Double getBalance() {
        return balance;
    }
    
    
}
