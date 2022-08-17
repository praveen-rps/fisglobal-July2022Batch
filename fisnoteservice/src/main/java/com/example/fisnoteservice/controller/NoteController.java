package com.example.fisnoteservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fisnoteservice.model.CommentsDto;
import com.example.fisnoteservice.model.Note;
import com.example.fisnoteservice.service.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {
	
	@Autowired
	NoteService service;
	
	
	@GetMapping("/search/comments/{pid}")
	public List<CommentsDto> getCommentsForPostId(@PathVariable("pid")int pid){
		
		return service.findCommentsForPid(pid);
	}
	
	
	@GetMapping("/all")
	public List<Note> getAll(){
		return service.findAllNotes();
	}
	
	@PostMapping("/add")
	public Note addNote(@RequestBody Note note) {
		return service.addNote(note);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deleteNotes(@PathVariable("pid")int pid) {
		return service.deleteNotes(pid);
	}
	
	@GetMapping("/author/{author}")
	public List<Note> getAllByAuthor(@PathVariable("author")String author){
		return service.findAllNotesByAuthor(author);
	}

	@GetMapping("/title/{title}")
	public List<Note> getAllByTitle(@PathVariable("title")String title){
		return service.findAllNotesByTitle(title);
	}
	
}
