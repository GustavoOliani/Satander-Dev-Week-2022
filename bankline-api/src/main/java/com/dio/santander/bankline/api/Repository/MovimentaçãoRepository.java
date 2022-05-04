package com.dio.santander.bankline.api.Repository;

import com.dio.santander.bankline.api.Model.Movimentação;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentaçãoRepository extends JpaRepository<Movimentação, Integer> {
    
}
