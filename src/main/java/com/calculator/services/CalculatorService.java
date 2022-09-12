package com.calculator.services;

import java.util.List;

import com.calculator.entities.Calculator;

public interface CalculatorService {

public void saveonedata(Calculator task);

public List<Calculator> listdetails();


Calculator findtheid(long id);

}
