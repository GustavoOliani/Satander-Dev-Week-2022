package com.dio.santander.bankline.api.Service;

import com.dio.santander.bankline.api.DataTransferObject.MovimentaçãoDto;
import com.dio.santander.bankline.api.Model.Correntista;
import com.dio.santander.bankline.api.Model.Movimentação;
import com.dio.santander.bankline.api.Model.MovimentaçãoTipo;
import com.dio.santander.bankline.api.Repository.CorrentistaRepository;
import com.dio.santander.bankline.api.Repository.MovimentaçãoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentaçãoService {

    @Autowired
    private MovimentaçãoRepository movimentaçãoRepository;

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(MovimentaçãoDto novaMovimentação){

        Movimentação movimentação = new Movimentação();

        Double valor = novaMovimentação.getValue();

        System.out.println("O valor que está sendo tranferido é: " + valor);
        if (novaMovimentação.getType() == MovimentaçãoTipo.EXPENSE){
            valor = -1 * valor;
        }

        movimentação.setDescription(novaMovimentação.getDescription());
        movimentação.setValue(valor);
        movimentação.setType(novaMovimentação.getType());
        movimentação.setIdAccount(novaMovimentação.getIdAccount());
        
        

        Correntista correntista = correntistaRepository.findById(novaMovimentação.getIdAccount()).orElse(null);
    
        if(correntista != null){
            correntista.getConta().deposita(valor);
            correntistaRepository.save(correntista);
        }
        movimentaçãoRepository.save(movimentação);
    }
    
}
