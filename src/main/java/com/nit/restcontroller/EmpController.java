package com.nit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.Iservice.IEmpServive;
import com.nit.entity.EmpModel;

@RestController
public class EmpController {

	@Autowired
	private IEmpServive service;
	@PostMapping("/emp")
	public ResponseEntity<String> saveEmp(EmpModel model)
	{
		String status = service.saveEmp(model);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	
}
