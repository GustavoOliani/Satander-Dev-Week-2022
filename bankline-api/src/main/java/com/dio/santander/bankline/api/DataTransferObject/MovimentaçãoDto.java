package com.dio.santander.bankline.api.DataTransferObject;

import com.dio.santander.bankline.api.Model.MovimentaçãoTipo;

public class MovimentaçãoDto {

    private String description;
    private Double value;
    private MovimentaçãoTipo type;
    private Integer IdAccount;


    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }

    public MovimentaçãoTipo getType() {
        return type;
    }

    public Integer getIdAccount() {
        return IdAccount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setType(MovimentaçãoTipo type) {
        this.type = type;
    }

    public void setIdAccount(Integer idAccount) {
        this.IdAccount = idAccount;
    }
}
