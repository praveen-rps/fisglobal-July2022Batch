package com.example.springboot.sscjpademo.service;

import java.util.List;
import java.util.Optional;

import com.example.springboot.sscjpademo.model.Ssc;

public interface SscService {
	
	public Ssc insert(Ssc ssc);
	public List<Ssc> displayAll();
	public String removeSscData(int htno);
	public Ssc updateData(Ssc ssc);
	public Optional<Ssc> searchByHtno(int htno);
	public List<Ssc> findDataByState(String state);

}
