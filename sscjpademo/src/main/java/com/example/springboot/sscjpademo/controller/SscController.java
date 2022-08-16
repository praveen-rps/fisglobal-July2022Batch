package com.example.springboot.sscjpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.sscjpademo.model.Ssc;
import com.example.springboot.sscjpademo.service.SscService;

@RestController
public class SscController {
	
	@Autowired
	SscService service;
	
	@GetMapping("/all")
	public List<Ssc> showAllData(){
		return service.displayAll();
	}
	
	
	@PostMapping("/add")
	public Ssc insertData(@RequestBody Ssc ssc) {
		return service.insert(ssc);
		
	}

}
