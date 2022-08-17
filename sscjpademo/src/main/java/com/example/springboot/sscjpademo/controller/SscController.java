package com.example.springboot.sscjpademo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.sscjpademo.model.Ssc;
import com.example.springboot.sscjpademo.service.SscService;

@RestController
public class SscController {
	
	@Autowired
	SscService service;
	
	@GetMapping("/state/{state}")
	public List<Ssc> showAllDataByState(@PathVariable("state") String state){
		return service.findDataByState(state);
	}
	
	@GetMapping("/all")
	public List<Ssc> showAllData(){
		return service.displayAll();
	}

	@PostMapping("/add")
	public Ssc insertData(@RequestBody Ssc ssc) {
		return service.insert(ssc);
	}
	
	@DeleteMapping("/delete/{htno}")
	public String deleteData(@PathVariable("htno") int htno) {
		return service.removeSscData(htno);
	}
	
	@PutMapping("/update")
	public Ssc UpdateSscData(@RequestBody Ssc ssc) {
		return service.updateData(ssc);
	}
	

	@GetMapping("/search/{htno}")
	public Optional<Ssc> searchSscData(@PathVariable("htno") int htno) {
		return service.searchByHtno(htno);
	}
	
	

}
