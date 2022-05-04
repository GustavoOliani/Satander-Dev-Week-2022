package com.dio.santander.bankline.api.Service;

import java.util.Date;

import com.dio.santander.bankline.api.DataTransferObject.CorrentistaDto;
import com.dio.santander.bankline.api.Model.Conta;
import com.dio.santander.bankline.api.Model.Correntista;
import com.dio.santander.bankline.api.Repository.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {

    @Autowired
    CorrentistaRepository correntistaRepository;

    public void save(CorrentistaDto novoCorrentista){
        Correntista correntista = new Correntista();
        
        correntista.setCpf(novoCorrentista.getCpf());
        correntista.setName(novoCorrentista.getNome());

        Conta conta = new Conta(0.0, new Date().getTime());

        correntista.setConta(conta);
        correntistaRepository.save(correntista);

    }
    
}
