package com.example.springboot.sscjpademo.service;

import java.util.List;

import com.example.springboot.sscjpademo.model.Ssc;

public interface SscService {
	
	public Ssc insert(Ssc ssc);
	public List<Ssc> displayAll();

}
