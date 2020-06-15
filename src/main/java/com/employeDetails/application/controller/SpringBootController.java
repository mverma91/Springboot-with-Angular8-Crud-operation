/**
 * 
 */
package com.employeDetails.application.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeDetails.application.model.EmployeePojo;
import com.employeDetails.application.service.mployeeervice;



/**
 * @author Manoj Verma
 *
 */

@RestController
@RequestMapping(value="/employeeDetail")
@CrossOrigin("*")
public class SpringBootController {
	@Autowired
	mployeeervice service;

	
	@PostMapping(value="/saveemployees",consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })

	public String addEmploeyeData(@RequestBody EmployeePojo employe){
		
	return  service.SaveEmplyeeDeatils(employe);	
		
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/gateemployees/{empdata}")
	public @ResponseBody  List<EmployeePojo> EmploeyeData(@PathVariable("empdata") String employee){
		
	return   service.getEmplyeeDeatils(employee);
		
	}
	
}
