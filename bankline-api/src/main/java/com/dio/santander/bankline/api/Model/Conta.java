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

    public Conta(){}
    
    public Long getNumber() {
        return number;
    }
    public Double getBalance() {
        return balance;
    }

    public void deposita(Double valor){
        if (this.balance + valor < 0){
            // TODO: fazer uma exeção que se encaixe melhor
            throw new ArithmeticException("Saldo negativo");
        }
        this.balance += valor;
    }
    
    
}
