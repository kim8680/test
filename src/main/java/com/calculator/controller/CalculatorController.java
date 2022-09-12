package com.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calculator.dto.Task;
import com.calculator.entities.Calculator;
import com.calculator.services.CalculatorService;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalculatorService service;
	
	@RequestMapping("/loadtask")
	public String viewpage() {
		return "new_task_page";
	}
	
	@RequestMapping("/save")
	public String savethedata(@ModelAttribute("object")Calculator task) {
		service.saveonedata(task);
		return "new_task_page";
	}
	
	@RequestMapping("/get")
	public String getthedata(ModelMap model) {
		List<Calculator> tasks = service.listdetails();
		model.addAttribute("msg", tasks);
		return "task_details";
	}
	
	@RequestMapping("/update")
	public String findthedata(@RequestParam ("id") long id,ModelMap model) {
		Calculator findtheid = service.findtheid(id);
		if(findtheid!=null) {
			model.addAttribute("lead", findtheid);
			return "update_task";
		}else {
			model.addAttribute("error", "no record !!");
			return "error_page";
		}
	}
	
	@RequestMapping("/savetask")
	public String updatethedata(Task task,ModelMap model) {
		Calculator call=new Calculator();
		call.setId(task.getId());
		call.setDuedate(task.getDuedate());
		call.setName(task.getName());
		call.setStartdate(task.getStartdate());
		call.setPriority(task.getPriority());
		call.setStatus(task.getStatus());
		
		service.saveonedata(call);
		List<Calculator> tasks = service.listdetails();
		model.addAttribute("msg", tasks);
		return "task_details";
		
	}
	
	
}
