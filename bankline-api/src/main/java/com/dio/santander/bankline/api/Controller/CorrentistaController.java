package com.dio.santander.bankline.api.Controller;

import java.util.List;

import com.dio.santander.bankline.api.DataTransferObject.CorrentistaDto;
import com.dio.santander.bankline.api.Model.Correntista;
import com.dio.santander.bankline.api.Repository.CorrentistaRepository;
import com.dio.santander.bankline.api.Service.CorrentistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    @Autowired
    private CorrentistaService correntistaService;

    @GetMapping
    public List<Correntista> findAll(){
        return correntistaRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody CorrentistaDto correntistaDto){
        correntistaService.save(correntistaDto);

    }
    
}
