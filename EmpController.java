package com.test.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.EmpModel.EmpModel;
import com.test.EmpService.EmpService;

//import jakarta.ws.rs.Produces;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
	
	@GetMapping(value = "/greet", produces="application/json")
	public String greet() {
		
		return empService.greetings();
	}
	@GetMapping("/empList")
	//public List<EmpModel> getEmpDetails(){
		public Map<Integer, List<String>> getEmpDetails(){
		return empService.employeeDetails();
	}
}
