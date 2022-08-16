package com.example.springboot.sscjpademo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.sscjpademo.model.Ssc;
import com.example.springboot.sscjpademo.repo.SscRepository;


@Service
public class SscServiceImpl implements SscService{
	
	
	@Autowired
	private SscRepository repo;

	@Override
	public Ssc insert(Ssc ssc) {
		// TODO Auto-generated method stub
		return repo.save(ssc);
	}

	@Override
	public List<Ssc> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
