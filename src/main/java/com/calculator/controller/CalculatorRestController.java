package com.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.entities.Calculator;
import com.calculator.services.CalculatorService;

@RestController
@RequestMapping("/class")
public class CalculatorRestController {
	
	@Autowired
	private CalculatorService serv; 
	
	@GetMapping("/getall")
	public List<Calculator> alltasks() {
		List<Calculator> all = serv.listdetails();
		return all;
	}
	
	@PostMapping("/save")
	public void tasksave(@RequestBody Calculator call) {
		serv.saveonedata(call);
	}
	
	@GetMapping("/get/{id}")
	public Calculator onetask(@PathVariable("id")long id) {
		Calculator find = serv.findtheid(id);
		return find;
	}
	
	@PutMapping("/change")
	public void taskupdate(@RequestBody Calculator call) {
		serv.saveonedata(call);
	}
	
	
}
