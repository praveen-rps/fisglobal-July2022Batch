package com.example.fisnoteservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.fisnoteservice.model.CommentsDto;


@FeignClient(name="commentservice", url="http://localhost:8082/comments")
public interface FeignProxy {
	
	@GetMapping("/search/{pid}")
	public List<CommentsDto> searchCommentsByPid(@PathVariable("pid") int pid);

}
