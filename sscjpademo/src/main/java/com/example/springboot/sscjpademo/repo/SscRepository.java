package com.example.springboot.sscjpademo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.sscjpademo.model.Ssc;

public interface SscRepository extends JpaRepository<Ssc,Integer>{

}

