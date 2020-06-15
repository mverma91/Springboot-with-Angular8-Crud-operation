package com.employeDetails.application.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import com.employeDetails.application.model.EmployeePojo;

@Service
public class mployeeervice {
	
	Map<String,List<EmployeePojo>> map=new ConcurrentHashMap();
	public String SaveEmplyeeDeatils(EmployeePojo emp) {
		String id=emp.getID();
		List<EmployeePojo> list=new LinkedList<>();
		list.add(emp);
		
		map.put(id, list);
		return emp.getName()+" "+ "Create SucessFully";
		
		
	}
	
	public List<EmployeePojo> getEmplyeeDeatils(String emp) {
		EmployeePojo employee=new EmployeePojo();
		if(map.containsKey(emp)) {
			List<EmployeePojo> list=map.get(emp);
		return list;	
			}
		List<EmployeePojo> list=map.entrySet().stream().flatMap(e->e.getValue().stream()).collect(Collectors.toList()); 
		//List<EmployeePojo> flatmap=list.stream().flatMap(e->e.stream()).collect(Collectors.toList());

		return list;
		
		
	}

}
