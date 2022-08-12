package com.example.fisspringboot.fisspringbootdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoController {
	
	
	@GetMapping("/params")
	public String getParams(@RequestParam("param1") String p) {
		return "The parameter is "+p;
	}
	
	
	@PostMapping("/postEmp")
	public String postData(@RequestBody Employee emp) {
		return emp.getName()+" is from "+emp.getDept()+" and working as "+emp.getDesg();
	}
	
	
	@GetMapping("/getdata/{name}/{city}")
	public String getParamData(@PathVariable("name") String name, @PathVariable("city") String city) {
		return "Hello, "+name+" Welcome  to "+city;
	}
	
	
	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		ArrayList<Employee> ar = new ArrayList<>();
		ar.add(new Employee("sunil","finance","mangaer"));
		ar.add(new Employee("anil","quality","lead"));
		ar.add(new Employee("sunil","marketing","executive"));
		return ar;
		
	}
	

	@RequestMapping(value="/get" , method=RequestMethod.GET)
	public String getResult() {
		return "Hi, I am from springboot rest method";
	}
	
	@PostMapping("/post")
	public String postResult() {
		return "Hi, I am from springboot post rest method";
	}
	
	@PutMapping("/put")
	public String putResult() {
		return "Hi, I am from springboot put rest method";
	}
	
	@DeleteMapping("/del")
	public String deleteResult() {
		return "Hi, I am from springboot delete rest method";
	}

}
