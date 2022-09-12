package com.calculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calculator.entities.Calculator;

public interface CalculatorRepository extends JpaRepository<Calculator, Long> {

}
