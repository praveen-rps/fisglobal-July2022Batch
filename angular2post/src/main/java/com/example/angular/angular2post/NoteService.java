package com.example.angular.angular2post;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
@Transactional
public class NoteService {
	
	@Autowired
	NoteRepo repo;
	
	public List<Note> findAll(){
		return repo.findAll();
	}
	
	public Note addPost(Note note) {
		return repo.save(note);
	}
	
	public Note searchPost(int pid) {
		boolean isfound=false;
		Note data =null;
		List<Note> notes = repo.findAll();
		for(Note note: notes) {
			if(note.getPid()==pid) {
				data=note;
				break;
			}
		}
		
		return data;
	
	}
	
	public int deleteNote(int pid) {
		repo.deleteById(pid);
		return 1;
	}
	
	

}
