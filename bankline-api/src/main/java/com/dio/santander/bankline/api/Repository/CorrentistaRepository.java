package com.dio.santander.bankline.api.Repository;

import com.dio.santander.bankline.api.Model.Correntista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
    
}
