package com.dio.santander.bankline.api.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {

    @Column(name = "conta_number")
    private Long number;
    @Column(name = "conta_balance")
    private Double balance;
    
    public Long getNumber() {
        return number;
    }
    public void setNumber(Long number) {
        this.number = number;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
}
