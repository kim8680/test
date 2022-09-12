package com.calculator.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.entities.Calculator;
import com.calculator.repository.CalculatorRepository;
@Service
public class CalculatorServiceimpl implements CalculatorService {
	
	@Autowired
	private CalculatorRepository repo;

	@Override
	public void saveonedata(Calculator task) {
		repo.save(task);
		
	}

	@Override
	public List<Calculator> listdetails() {
		List<Calculator> list = repo.findAll();
		return list;
	}

	@Override
	public Calculator findtheid(long id) {
		Optional<Calculator> byId = repo.findById(id);
		if(byId.isPresent()) {
			Calculator ide = byId.get();
			return ide;
		}else {
			return null;
		}
	}



}
