package com.dio.santander.bankline.api.Controller;

import java.util.List;

import com.dio.santander.bankline.api.DataTransferObject.MovimentaçãoDto;
import com.dio.santander.bankline.api.Model.Movimentação;
import com.dio.santander.bankline.api.Repository.MovimentaçãoRepository;
import com.dio.santander.bankline.api.Service.MovimentaçãoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentações")
public class MovimentaçãoController {

    @Autowired
    private MovimentaçãoRepository movimentaçãoRepository;

    @Autowired
    private MovimentaçãoService movimentaçãoService;

    @GetMapping
    public List<Movimentação> findAll(){
        return movimentaçãoRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody MovimentaçãoDto movimentaçãoDto){
        if (movimentaçãoDto.getValue() == null){
            throw new NullPointerException("O Objeto é nulo: " + movimentaçãoDto.getValue());
        }
        movimentaçãoService.save(movimentaçãoDto);
    }
    
}
