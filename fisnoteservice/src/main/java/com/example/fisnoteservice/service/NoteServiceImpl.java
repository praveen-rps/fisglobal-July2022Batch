package com.example.fisnoteservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.fisnoteservice.model.CommentsDto;
import com.example.fisnoteservice.model.Note;
import com.example.fisnoteservice.repo.NoteRepository;


@Service
public class NoteServiceImpl implements NoteService{
	
	@Autowired
	FeignProxy proxy;
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	NoteRepository repo;

	@Override
	public List<Note> findAllNotes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Note addNote(Note note) {
		// TODO Auto-generated method stub
		return repo.save(note);
	}

	@Override
	public String deleteNotes(int pid) {
		// TODO Auto-generated method stub
		repo.deleteById(pid);
		return "Notes Deleted...!";
	}

	@Override
	public List<Note> findAllNotesByAuthor(String author) {
		// TODO Auto-generated method stub
		return repo.findNotesByAuthor(author);
	}

	@Override
	public List<Note> findAllNotesByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findNotesByTitle(title);
	}

	@Override
	public List<CommentsDto> findCommentsForPid(int pid) {
		// TODO Auto-generated method stub
		
		String url= "http://localhost:8082/comments/search/"+pid;
		//return template.getForObject(url, List.class);
		
		return proxy.searchCommentsByPid(pid);
	}

}
