package com.example.springboot.sscjpademo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springboot.sscjpademo.model.Ssc;

public interface SscRepository extends JpaRepository<Ssc,Integer>{
	
	
	@Query("select s from Ssc s where s.state=?1 ")
	public List<Ssc> getStudentsByState(String state);

}

