package com.test.EmpRepo;

import org.springframework.stereotype.Repository;

import com.test.EmpModel.EmpModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class EmpRepo {

	
	public String empGreet() {
		return "Hello employee!! U r in Empolyee Repo class!!!";
	}
	
	//public List<EmpModel> empDetails(){
		public Map<Integer, List<String>> empDetails(){
		EmpModel e1= new EmpModel(1,"ddd");
		EmpModel e5= new EmpModel(5,"ggg");
		EmpModel e3= new EmpModel(3,"bbb");
		EmpModel e6= new EmpModel(6,"hhh");
		EmpModel e4= new EmpModel(4,"aaa");
		EmpModel e2= new EmpModel(2,"ccc");
		EmpModel e7= new EmpModel(1,"ddd");
		
		List<EmpModel> empList=Arrays.asList(e1,e2,e3,e4,e5,e6,e7);

		List<EmpModel> finalList=empList.stream().collect(Collectors.toList());//remove duplicate

		Map<Integer, List<String>> duplicateList= empList.stream().collect(
				Collectors.groupingBy(EmpModel::getEmpId,
						Collectors.mapping(EmpModel::getEmpName, Collectors.toList())
						));
		for(int l=0;l<finalList.size();l++)
		{
			System.out.println(finalList.get(l).empId+""+finalList.get(l).empName);
		}
		//return finalList;
		return duplicateList;
	}
}
		
		
