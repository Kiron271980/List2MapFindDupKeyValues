package com.test.EmpService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.EmpModel.EmpModel;
import com.test.EmpRepo.EmpRepo;

@Service
public class EmpService {
	@Autowired
	EmpRepo empRepo;
	
	public String greetings() {
		
		return empRepo.empGreet();
	}

	//public List<EmpModel> employeeDetails(){
		public	Map<Integer, List<String>> employeeDetails(){
		return empRepo.empDetails();
	}
}
